package dev.notcacha.motd.api.motd.matcher;

import dev.notcacha.motd.api.motd.Motd;

import java.util.Optional;

public interface MotdMatcher {

    Motd getMotdById(String id);

    Motd getCurrentMotd();
}
