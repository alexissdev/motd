package dev.notcacha.motd.commons.bungee.loader;

import dev.notcacha.motd.api.Service;
import dev.notcacha.motd.commons.bungee.command.flow.CommonsBungeeFlowModule;
import me.fixeddev.commandflow.CommandManager;
import me.fixeddev.commandflow.annotated.AnnotatedCommandTreeBuilder;
import me.fixeddev.commandflow.annotated.AnnotatedCommandTreeBuilderImpl;
import me.fixeddev.commandflow.annotated.builder.AnnotatedCommandBuilderImpl;
import me.fixeddev.commandflow.annotated.part.PartInjector;
import me.fixeddev.commandflow.annotated.part.SimplePartInjector;
import me.fixeddev.commandflow.bungee.BungeeCommandManager;
import me.yushust.inject.Injector;
import net.md_5.bungee.api.plugin.Plugin;

import javax.inject.Inject;

public class CommonsBungeeCommandLoaderService implements Service {

    @Inject
    private Plugin plugin;
    @Inject
    private Injector injector;

    @Override
    public void start() {
        CommandManager commandManager = new BungeeCommandManager(plugin);

        PartInjector partInjector = new SimplePartInjector();
        partInjector.install(new CommonsBungeeFlowModule());

        AnnotatedCommandTreeBuilder treeBuilder = new AnnotatedCommandTreeBuilderImpl(
                new AnnotatedCommandBuilderImpl(partInjector),
                (clazz, parent) -> this.injector.getInstance(clazz)
        );
    }
}
