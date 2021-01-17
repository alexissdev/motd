package dev.notcacha.motd.commons.bungee.command.flow;

import dev.notcacha.motd.api.motd.Motd;
import me.fixeddev.commandflow.CommandContext;
import me.fixeddev.commandflow.exception.ArgumentParseException;
import me.fixeddev.commandflow.part.ArgumentPart;
import me.fixeddev.commandflow.stack.ArgumentStack;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;

public class MotdTypePart implements ArgumentPart {

    private final String name;

    public MotdTypePart(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<? extends Object> parseValue(CommandContext commandContext, ArgumentStack argumentStack) throws ArgumentParseException {
        if (!argumentStack.hasNext()) {
            return Collections.singletonList(Motd.EMPTY(null));
        }

        String motdId = argumentStack.next();


        return Collections.singletonList(Motd.Type.getType(motdId));
    }

    @Override
    public Type getType() {
        return Motd.Type.class;
    }
}
