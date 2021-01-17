package dev.notcacha.motd.commons.bungee.service;

import dev.notcacha.motd.api.Service;

import javax.inject.Inject;
import javax.inject.Named;

public class CommonsBungeeLoaderService implements Service {

    @Inject
    @Named("motd-loader-service")
    private Service motdLoaderService;
    @Inject
    @Named("command-loader-service")
    private Service commandLoaderService;
    @Inject
    @Named("listener-loader-service")
    private Service listenerLoaderService;

    @Override
    public void start() {
        motdLoaderService.start();
        commandLoaderService.start();
        listenerLoaderService.start();
    }
}
