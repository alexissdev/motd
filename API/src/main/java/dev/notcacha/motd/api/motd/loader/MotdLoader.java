package dev.notcacha.motd.api.motd.loader;

import dev.notcacha.motd.api.motd.Motd;

public interface MotdLoader {

    String CONFIGURATION_KEY = "motd.%s";

    Motd load(String motdId);

}
