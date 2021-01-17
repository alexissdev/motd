package dev.notcacha.motd.commons.bungee;

import dev.notcacha.motd.commons.bungee.file.CommonsBungeeFileModule;
import dev.notcacha.motd.commons.bungee.message.CommonsBungeeMessageModule;
import dev.notcacha.motd.commons.bungee.motd.CommonsBungeeMotdModule;
import dev.notcacha.motd.commons.bungee.service.CommonsBungeeServiceModule;
import me.yushust.inject.AbstractModule;
import net.md_5.bungee.api.plugin.Plugin;

public class CommonsBungeeModule extends AbstractModule {

    private final Plugin plugin;

    public CommonsBungeeModule(Plugin plugin) {
        this.plugin = plugin;
    }

    @Override
    protected void configure() {
        bind(Plugin.class).toInstance(plugin);

        install(new CommonsBungeeFileModule(plugin));

        install(new CommonsBungeeMessageModule());

        install(new CommonsBungeeMotdModule());
        install(new CommonsBungeeServiceModule());
    }
}
