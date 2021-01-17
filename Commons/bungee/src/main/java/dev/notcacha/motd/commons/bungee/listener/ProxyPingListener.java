package dev.notcacha.motd.commons.bungee.listener;

import dev.notcacha.motd.api.motd.Motd;
import dev.notcacha.motd.api.motd.matcher.MotdMatcher;
import net.md_5.bungee.api.ServerPing;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.event.ProxyPingEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;

import javax.inject.Inject;

public class ProxyPingListener implements Listener {

    @Inject
    private MotdMatcher motdMatcher;

    @EventHandler
    public void onProxyPing(ProxyPingEvent event) {
        ServerPing ping = event.getResponse();

        Motd currentMotd = motdMatcher.getCurrentMotd();

        ping.setDescriptionComponent(
                new TextComponent(
                        TextComponent.fromLegacyText(
                                currentMotd.getFirstLine() + "\n" + currentMotd.getTwoLine()
                        )
                )
        );
    }
}
