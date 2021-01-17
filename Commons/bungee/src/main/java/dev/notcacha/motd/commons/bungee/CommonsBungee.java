package dev.notcacha.motd.commons.bungee;

import dev.notcacha.motd.api.Service;
import me.yushust.inject.Injector;
import net.md_5.bungee.api.plugin.Plugin;

import javax.inject.Inject;

public class CommonsBungee extends Plugin {

    @Inject
    private Service service;

    @Override
    public void onEnable() {
        Injector injector = Injector.create(new CommonsBungeeModule(this));
        injector.injectMembers(this);

        service.start();
    }

    @Override
    public void onDisable() {
        service.stop();
    }
}
