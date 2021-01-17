package dev.notcacha.motd.commons.bungee.command.motd;

import dev.notcacha.motd.api.message.MessageHandler;
import dev.notcacha.motd.api.motd.Motd;
import dev.notcacha.motd.api.motd.processor.MotdLineUpdaterProcessor;
import me.fixeddev.commandflow.annotated.CommandClass;
import me.fixeddev.commandflow.annotated.annotation.Command;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.chat.TextComponent;

import javax.inject.Inject;

@Command(names = "setline", desc = "Set line from motd", permission = "motd.set.line")
public class CommonsBungeeSetLineMotdCommand implements CommandClass {

    @Inject
    private MessageHandler messageHandler;
    @Inject
    private MotdLineUpdaterProcessor motdLineUpdaterProcessor;

    @Command(names = "")
    public boolean setLine(CommandSender sender, Motd.Type type, int line, String text) {
        if (!Motd.Type.isValid(type)) {
            sender.sendMessage(
                    TextComponent.fromLegacyText(
                            messageHandler.getMessage("invalid.type")
                    )
            );
        }

        if (line > 2) {
            sender.sendMessage(
                    TextComponent.fromLegacyText(
                            String.format(
                                    messageHandler.getMessage("invalid.line"), line
                            )
                    )
            );
            return true;
        }

        motdLineUpdaterProcessor.setLine(type, line, text);
        sender.sendMessage(
                TextComponent.fromLegacyText(
                        String.format(
                                messageHandler.getMessage("set.line"), line
                        )
                )
        );
        return true;
    }
}
