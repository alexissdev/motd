package dev.notcacha.motd.api.motd.processor;

import dev.notcacha.motd.api.motd.Motd;

public interface MotdLineUpdaterProcessor {

    void setLine(Motd.Type type, int line, String text);

}
