package dev.notcacha.motd.commons.bungee.motd.builder;

import dev.notcacha.motd.api.motd.Motd;
import dev.notcacha.motd.api.motd.builder.MotdBuilder;
import dev.notcacha.motd.commons.bungee.motd.CommonsBungeeMotd;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CommonsBungeeMotdBuilder implements MotdBuilder {

    private final String id;

    private String firstLine;
    private String twoLine;
    private List<String> description;

    public CommonsBungeeMotdBuilder(String id) {
        this.id = id;
        this.firstLine = null;
        this.twoLine = null;
        this.description = new LinkedList<>();
    }

    @Override
    public MotdBuilder setFirstLine(String line) {
        this.firstLine = line;
        return this;
    }

    @Override
    public MotdBuilder setTwoLine(String line) {
        this.twoLine = line;
        return this;
    }

    @Override
    public MotdBuilder addDescription(String... lines) {
        description.addAll(
                Arrays.asList(lines)
        );
        return this;
    }

    @Override
    public MotdBuilder setDescription(List<String> description) {
        this.description = new LinkedList<>(
                description
        );
        return this;
    }

    @Override
    public Motd build() {
        return new CommonsBungeeMotd(
                id,
                firstLine,
                twoLine,
                description
        );
    }

    public static MotdBuilder builder(String id) {
        return new CommonsBungeeMotdBuilder(id);
    }
}
