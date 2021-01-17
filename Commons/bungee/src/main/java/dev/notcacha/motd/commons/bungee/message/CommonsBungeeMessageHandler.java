package dev.notcacha.motd.commons.bungee.message;

import dev.notcacha.motd.api.message.MessageHandler;
import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.config.Configuration;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

public class CommonsBungeeMessageHandler implements MessageHandler {

    @Inject
    @Named("messages")
    private Configuration configuration;

    @Override
    public String getMessage(String path) {
        return ChatColor.translateAlternateColorCodes('&', configuration.getString(path));
    }

    @Override
    public List<String> getMessages(String path) {
        List<String> list = configuration.getStringList(path);

        list.replaceAll(
                string -> ChatColor.translateAlternateColorCodes('&', string)
        );

        return list;
    }
}
