package dev.notcacha.motd.commons.bungee.command;

import dev.notcacha.motd.api.message.MessageHandler;
import dev.notcacha.motd.commons.bungee.command.motd.CommonsBungeeSetLineMotdCommand;
import dev.notcacha.motd.commons.bungee.command.motd.CommonsBungeeSetMotdCommand;
import me.fixeddev.commandflow.annotated.CommandClass;
import me.fixeddev.commandflow.annotated.annotation.Command;
import me.fixeddev.commandflow.annotated.annotation.SubCommandClasses;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.chat.TextComponent;

import javax.inject.Inject;

@Command(names = "motd", desc = "Main command from motd commands!", permission = "motd.use")
@SubCommandClasses({
                CommonsBungeeSetMotdCommand.class,
                CommonsBungeeSetLineMotdCommand.class
        }
)
public class CommonsBungeeMotdCommand implements CommandClass {

    @Inject
    private MessageHandler messageHandler;

    @Command(names = "")
    public boolean main(CommandSender sender) {
        messageHandler.getMessages("help-message").forEach(
                message -> sender.sendMessage(TextComponent.fromLegacyText(message))
        );
        return true;
    }
}
