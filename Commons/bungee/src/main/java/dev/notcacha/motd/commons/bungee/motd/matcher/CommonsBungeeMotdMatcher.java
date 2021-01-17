package dev.notcacha.motd.commons.bungee.motd.matcher;

import dev.notcacha.motd.api.motd.Motd;
import dev.notcacha.motd.api.motd.matcher.MotdMatcher;
import dev.notcacha.motd.commons.bungee.CommonsBungeeObjectCache;

import javax.inject.Inject;

public class CommonsBungeeMotdMatcher implements MotdMatcher {

    @Inject
    private CommonsBungeeObjectCache<Motd> motdObjectCache;

    @Override
    public Motd getMotdById(String id) {
        return motdObjectCache.getById(id).orElseGet(() -> Motd.EMPTY(id));

    }
}
