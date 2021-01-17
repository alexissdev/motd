package dev.notcacha.motd.commons.bungee.loader;

import dev.notcacha.motd.api.Service;
import dev.notcacha.motd.commons.bungee.listener.ProxyPingListener;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.api.plugin.Plugin;

import javax.inject.Inject;

public class CommonsBungeeEventLoaderService implements Service {

    @Inject
    private Plugin plugin;

    @Inject
    private ProxyPingListener proxyPingListener;

    @Override
    public void start() {
        register(
                proxyPingListener
        );
    }

    private void register(Listener... listeners) {
        for (Listener listener : listeners) {
            plugin.getProxy().getPluginManager().registerListener(plugin, listener);
        }
    }
}
