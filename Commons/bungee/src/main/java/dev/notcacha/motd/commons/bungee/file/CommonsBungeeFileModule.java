package dev.notcacha.motd.commons.bungee.file;

import me.yushust.inject.AbstractModule;
import net.md_5.bungee.api.plugin.Plugin;
import net.md_5.bungee.config.Configuration;

public class CommonsBungeeFileModule extends AbstractModule {

    private final Plugin plugin;

    public CommonsBungeeFileModule(Plugin plugin) {
        this.plugin = plugin;
    }

    @Override
    protected void configure() {
        bind(Configuration.class).named("motd").toInstance(
                new FileCreator(plugin, "motd.yml").getFile()
        );
        bind(Configuration.class).named("messages").toInstance(
                new FileCreator(plugin, "messages.yml").getFile()
        );
    }
}
