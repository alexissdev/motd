package dev.notcacha.motd.commons.bungee.motd.processor;

import dev.notcacha.motd.api.motd.Motd;
import dev.notcacha.motd.api.motd.matcher.MotdMatcher;
import dev.notcacha.motd.api.motd.processor.MotdLineUpdaterProcessor;
import dev.notcacha.motd.commons.bungee.CommonsBungeeObjectCache;
import net.md_5.bungee.api.ChatColor;

import javax.inject.Inject;

public class CommonsBungeeMotdLineUpdaterProcessor implements MotdLineUpdaterProcessor {

    @Inject
    private MotdMatcher motdMatcher;
    @Inject
    private CommonsBungeeObjectCache<Motd> motdObjectCache;

    @Override
    public void setLine(Motd.Type type, int line, String text) {
        Motd motd = motdMatcher.getMotdById(type.getId());

        String colorText = ChatColor.translateAlternateColorCodes('&', text);

        switch (line) {
            case 1: {
                motd.setFirstLine(colorText);
            }

            case 2: {
                motd.setSecondLine(colorText);
            }
        }

        motdObjectCache.update(motd);
    }
}
