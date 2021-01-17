package dev.notcacha.motd.commons.bungee.service;

import dev.notcacha.motd.api.Service;

import javax.inject.Inject;
import javax.inject.Named;

public class CommonsBungeeMotdService implements Service {

    @Inject
    @Named("motd-loader-service")
    private Service motdLoaderService;

    @Override
    public void start() {
        motdLoaderService.start();
    }

    @Override
    public void stop() {
        motdLoaderService.stop();
    }
}
