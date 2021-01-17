package dev.notcacha.motd.commons.bungee.command.flow;

import dev.notcacha.motd.api.motd.Motd;
import me.fixeddev.commandflow.annotated.part.AbstractModule;
import me.fixeddev.commandflow.annotated.part.defaults.DefaultsModule;
import me.fixeddev.commandflow.bungee.factory.BungeeModule;

public class CommonsBungeeFlowModule extends AbstractModule {

    @Override
    public void configure() {
        getInjector().install(new BungeeModule());
        getInjector().install(new DefaultsModule());

        bindFactory(Motd.Type.class, new MotdTypePartFactory());
    }
}
