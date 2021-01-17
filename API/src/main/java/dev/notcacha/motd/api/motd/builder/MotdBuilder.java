package dev.notcacha.motd.api.motd.builder;

import dev.notcacha.motd.api.motd.Motd;

import java.util.List;

public interface MotdBuilder {

    MotdBuilder setFirstLine(String line);

    MotdBuilder setSecondLine(String line);

    MotdBuilder addDescription(String... lines);

    MotdBuilder setDescription(List<String> description);

    Motd build();
}
