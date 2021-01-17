package dev.notcacha.motd.commons.bungee.command.motd;

import dev.notcacha.motd.api.message.MessageHandler;
import dev.notcacha.motd.api.motd.Motd;
import dev.notcacha.motd.api.motd.processor.MotdStatusUpdaterProcessor;
import me.fixeddev.commandflow.annotated.CommandClass;
import me.fixeddev.commandflow.annotated.annotation.Command;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.chat.TextComponent;

import javax.inject.Inject;

@Command(names = "set", desc = "Set motd type", permission = "motd.set.type")
public class CommonsBungeeSetMotdCommand implements CommandClass {

    @Inject
    private MessageHandler messageHandler;
    @Inject
    private MotdStatusUpdaterProcessor motdStatusUpdaterProcessor;


    @Command(names = "")
    public boolean set(CommandSender sender, Motd.Type type) {
        if (!Motd.Type.isValid(type)) {
            sender.sendMessage(
                    TextComponent.fromLegacyText(
                            messageHandler.getMessage("invalid.type")
                    )
            );
        }

        motdStatusUpdaterProcessor.setCurrentType(type);
        sender.sendMessage(
                TextComponent.fromLegacyText(
                        String.format(messageHandler.getMessage("set.type"), type.getId())
                )
        );
        return true;
    }
}
