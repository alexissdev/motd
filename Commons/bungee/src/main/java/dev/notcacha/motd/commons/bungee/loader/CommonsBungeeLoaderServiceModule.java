package dev.notcacha.motd.commons.bungee.loader;

import dev.notcacha.motd.api.Service;
import dev.notcacha.motd.commons.bungee.motd.loader.CommonsBungeeMotdLoaderService;
import me.yushust.inject.AbstractModule;

public class CommonsBungeeLoaderServiceModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(Service.class).named("motd-loader-service").to(CommonsBungeeMotdLoaderService.class).singleton();
        bind(Service.class).named("command-loader-service").to(CommonsBungeeCommandLoaderService.class).singleton();
        bind(Service.class).named("listener-loader-service").to(CommonsBungeeEventLoaderService.class).singleton();
    }
}
