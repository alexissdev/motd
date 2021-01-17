package dev.notcacha.motd.commons.bungee.motd;

import dev.notcacha.motd.api.motd.Motd;

import java.util.List;

public class CommonsBungeeMotd implements Motd {

    private final String id;
    private String firstLine;
    private String secondLine;
    private List<String> description;

    public CommonsBungeeMotd(String id, String firstLine, String secondLine, List<String> description) {
        this.id = id;
        this.firstLine = firstLine;
        this.secondLine = secondLine;
        this.description = description;
    }

    @Override
    public String getId() {
        return id;
    }

    public String getFirstLine() {
        return firstLine;
    }

    @Override
    public void setFirstLine(String line) {
        this.firstLine = line;
    }

    public String getSecondLine() {
        return secondLine;
    }

    @Override
    public void setSecondLine(String line) {
        this.secondLine = line;
    }

    public List<String> getDescription() {
        return description;
    }

    @Override
    public void setDescription(List<String> description) {
        this.description = description;
    }
}
