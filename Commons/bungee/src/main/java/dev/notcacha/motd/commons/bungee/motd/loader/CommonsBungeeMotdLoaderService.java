package dev.notcacha.motd.commons.bungee.motd.loader;

import dev.notcacha.motd.api.Service;
import dev.notcacha.motd.api.motd.Motd;
import dev.notcacha.motd.commons.bungee.CommonsBungeeObjectCache;

import javax.inject.Inject;

public class CommonsBungeeMotdLoaderService implements Service {

    @Inject
    private CommonsBungeeObjectCache<Motd> motdObjectCache;

    @Override
    public void start() {
        motdObjectCache.load(Motd.Type.NORMAL.getId());
        motdObjectCache.load(Motd.Type.WHITELIST.getId());
    }
}
