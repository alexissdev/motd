package dev.notcacha.motd.commons.bungee.service;

import dev.notcacha.motd.api.Service;
import dev.notcacha.motd.commons.bungee.loader.CommonsBungeeLoaderServiceModule;
import me.yushust.inject.AbstractModule;

public class CommonsBungeeServiceModule extends AbstractModule {

    @Override
    protected void configure() {
        install(new CommonsBungeeLoaderServiceModule());

        bind(Service.class).named("motd-service").to(CommonsBungeeMotdService.class).singleton();

        bind(Service.class).to(CommonsBungeeService.class).singleton();
    }
}
