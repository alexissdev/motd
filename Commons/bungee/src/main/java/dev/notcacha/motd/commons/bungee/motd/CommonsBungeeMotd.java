package dev.notcacha.motd.commons.bungee.motd;

import dev.notcacha.motd.api.motd.Motd;

import java.util.List;

public class CommonsBungeeMotd implements Motd {

    private final String id;
    private final String firstLine;
    private final String twoLine;
    private final List<String> description;

    public CommonsBungeeMotd(String id, String firstLine, String twoLine, List<String> description) {
        this.id = id;
        this.firstLine = firstLine;
        this.twoLine = twoLine;
        this.description = description;
    }

    @Override
    public String getId() {
        return id;
    }

    public String getFirstLine() {
        return firstLine;
    }

    public String getTwoLine() {
        return twoLine;
    }

    public List<String> getDescription() {
        return description;
    }
}
