package dev.notcacha.motd.commons.bungee.motd;

import dev.notcacha.motd.api.motd.Motd;
import dev.notcacha.motd.api.motd.loader.MotdLoader;
import dev.notcacha.motd.commons.bungee.CommonsBungeeObjectCache;

import javax.inject.Inject;

public class CommonsBungeeMotdObjectCache extends CommonsBungeeObjectCache<Motd> {

    @Inject
    private MotdLoader motdLoader;

    @Override
    public void load(String modelId) {
        add(motdLoader.load(modelId));
    }
}
