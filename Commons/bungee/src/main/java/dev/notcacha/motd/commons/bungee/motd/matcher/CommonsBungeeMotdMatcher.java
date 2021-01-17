package dev.notcacha.motd.commons.bungee.motd.matcher;

import dev.notcacha.motd.api.motd.Motd;
import dev.notcacha.motd.api.motd.matcher.MotdMatcher;
import dev.notcacha.motd.api.motd.processor.MotdStatusUpdaterProcessor;
import dev.notcacha.motd.commons.bungee.CommonsBungeeObjectCache;

import javax.inject.Inject;

public class CommonsBungeeMotdMatcher implements MotdMatcher {

    @Inject
    private CommonsBungeeObjectCache<Motd> motdObjectCache;

    @Inject
    private MotdStatusUpdaterProcessor motdStatusUpdaterProcessor;

    @Override
    public Motd getMotdById(String id) {
        return motdObjectCache.getById(id).orElseGet(() -> Motd.EMPTY(id));

    }

    @Override
    public Motd getCurrentMotd() {
        return getMotdById(
                motdStatusUpdaterProcessor.getCurrentType().getId()
        );
    }
}
