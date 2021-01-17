package dev.notcacha.motd.commons.bungee.motd;

import dev.notcacha.motd.api.motd.Motd;
import dev.notcacha.motd.api.motd.loader.MotdLoader;
import dev.notcacha.motd.api.motd.matcher.MotdMatcher;
import dev.notcacha.motd.api.motd.processor.MotdLineUpdaterProcessor;
import dev.notcacha.motd.api.motd.processor.MotdStatusUpdaterProcessor;
import dev.notcacha.motd.commons.bungee.CommonsBungeeObjectCache;
import dev.notcacha.motd.commons.bungee.motd.loader.CommonsBungeeMotdLoader;
import dev.notcacha.motd.commons.bungee.motd.matcher.CommonsBungeeMotdMatcher;
import dev.notcacha.motd.commons.bungee.motd.processor.CommonsBungeeMotdLineUpdaterProcessor;
import dev.notcacha.motd.commons.bungee.motd.processor.CommonsBungeeMotdStatusUpdaterProcessor;
import me.yushust.inject.AbstractModule;
import me.yushust.inject.key.TypeReference;

public class CommonsBungeeMotdModule extends AbstractModule {

    @Override
    public void configure() {
        bind(MotdLoader.class).to(CommonsBungeeMotdLoader.class).singleton();
        bind(new TypeReference<CommonsBungeeObjectCache<Motd>>() {}).to(CommonsBungeeMotdObjectCache.class).singleton();

        bind(MotdStatusUpdaterProcessor.class).to(CommonsBungeeMotdStatusUpdaterProcessor.class).singleton();
        bind(MotdMatcher.class).to(CommonsBungeeMotdMatcher.class).singleton();

        bind(MotdLineUpdaterProcessor.class).to(CommonsBungeeMotdLineUpdaterProcessor.class).singleton();
    }
}
