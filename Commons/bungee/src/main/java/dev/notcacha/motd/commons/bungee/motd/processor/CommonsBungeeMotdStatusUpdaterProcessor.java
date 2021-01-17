package dev.notcacha.motd.commons.bungee.motd.processor;

import dev.notcacha.motd.api.motd.Motd;
import dev.notcacha.motd.api.motd.processor.MotdStatusUpdaterProcessor;

public class CommonsBungeeMotdStatusUpdaterProcessor implements MotdStatusUpdaterProcessor {

    private Motd.Type type;

    public CommonsBungeeMotdStatusUpdaterProcessor() {
        type = Motd.Type.NORMAL;
    }

    @Override
    public Motd.Type getCurrentType() {
        return type;
    }

    @Override
    public void setCurrentType(Motd.Type type) {
        this.type = type;
    }
}
