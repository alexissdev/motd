package dev.notcacha.motd.api.motd;

import dev.notcacha.motd.api.model.SavableModel;

import java.util.Collections;
import java.util.List;

public interface Motd extends SavableModel {

    String getFirstLine();

    void setFirstLine(String line);

    String getSecondLine();

    void setSecondLine(String line);

    List<String> getDescription();

    void setDescription(List<String> description);

    enum Type {

        NORMAL("NORMAL_MOTD"),
        WHITELIST("WHITELIST_MOTD");

        private final String id;

        Type(String id) {
            this.id = id;
        }
        public String getId() {
            return id;
        }

        public static Motd.Type getType(String text) {
            Motd.Type type = valueOf(text);

            if (text.toLowerCase().startsWith("normal")) {
                type = NORMAL;
            }
            if (text.toLowerCase().startsWith("whitelist")) {
                type = WHITELIST;
            }

            return type;
        }

        public static boolean isValid(Motd.Type type) {
            switch (type) {
                case NORMAL:

                case WHITELIST: {
                    return true;
                }

                default: {
                    return false;
                }
            }
        }
    }

    static Motd EMPTY(String motdId) {
        return new Motd() {

            private String first = "The motd main line has not been established!";
            private String second = "The secondary motd line has not been established!";
            private List<String> description = Collections.singletonList("No list has been established!");

            @Override
            public String getFirstLine() {
                return first;
            }

            @Override
            public void setFirstLine(String line) {
                this.first = line;
            }

            @Override
            public String getSecondLine() {
                return second;
            }

            @Override
            public void setSecondLine(String line) {
                second = line;
            }

            @Override
            public List<String> getDescription() {
                return description;
            }

            @Override
            public void setDescription(List<String> description) {
                this.description = description;
            }

            @Override
            public String getId() {
                return motdId;
            }
        };
    }
}
