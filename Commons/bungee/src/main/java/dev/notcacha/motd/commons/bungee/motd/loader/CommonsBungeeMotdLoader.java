package dev.notcacha.motd.commons.bungee.motd.loader;

import dev.notcacha.motd.api.motd.Motd;
import dev.notcacha.motd.api.motd.loader.MotdLoader;
import dev.notcacha.motd.commons.bungee.motd.builder.CommonsBungeeMotdBuilder;
import net.md_5.bungee.config.Configuration;

import javax.inject.Inject;
import javax.inject.Named;

public class CommonsBungeeMotdLoader implements MotdLoader {

    @Inject
    @Named("motd")
    private Configuration configuration;

    @Override
    public Motd load(String motdId) {
        if (!configuration.contains(String.format(MotdLoader.CONFIGURATION_KEY, motdId))) {
            return Motd.EMPTY(motdId);
        }

        return CommonsBungeeMotdBuilder.builder(motdId)
                .setFirstLine(configuration.getString(
                        String.format(MotdLoader.CONFIGURATION_KEY, motdId) + ".first"
                ))
                .setSecondLine(configuration.getString(
                        String.format(MotdLoader.CONFIGURATION_KEY, motdId) + ".two"
                ))
                .setDescription(configuration.getStringList(
                        String.format(MotdLoader.CONFIGURATION_KEY, motdId) + ".description"
                ))
                .build();
    }
}
