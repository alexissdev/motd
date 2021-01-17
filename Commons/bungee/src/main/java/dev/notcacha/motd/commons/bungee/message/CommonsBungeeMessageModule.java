package dev.notcacha.motd.commons.bungee.message;

import dev.notcacha.motd.api.message.MessageHandler;
import me.yushust.inject.AbstractModule;

public class CommonsBungeeMessageModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(MessageHandler.class).to(CommonsBungeeMessageHandler.class).singleton();
    }
}
