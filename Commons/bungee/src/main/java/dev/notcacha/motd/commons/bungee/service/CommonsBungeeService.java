package dev.notcacha.motd.commons.bungee.service;

import dev.notcacha.motd.api.Service;

import javax.inject.Inject;
import javax.inject.Named;

public class CommonsBungeeService implements Service {

    @Inject
    @Named("motd-service")
    private Service motdService;
    @Inject
    @Named("loader-service")
    private Service loaderService;


    @Override
    public void start() {
        motdService.start();
        loaderService.start();
    }

    @Override
    public void stop() {
        motdService.stop();
        loaderService.stop();
    }
}
