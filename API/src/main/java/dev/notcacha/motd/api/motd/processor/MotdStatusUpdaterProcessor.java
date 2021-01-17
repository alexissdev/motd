package dev.notcacha.motd.api.motd.processor;

import dev.notcacha.motd.api.motd.Motd;

public interface MotdStatusUpdaterProcessor {

    Motd.Type getCurrentType();

    void setCurrentType(Motd.Type type);

}
