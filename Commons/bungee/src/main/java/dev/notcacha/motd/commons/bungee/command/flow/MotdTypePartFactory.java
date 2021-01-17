package dev.notcacha.motd.commons.bungee.command.flow;

import me.fixeddev.commandflow.annotated.part.PartFactory;
import me.fixeddev.commandflow.part.CommandPart;

import java.lang.annotation.Annotation;
import java.util.List;

public class MotdTypePartFactory implements PartFactory {

    @Override
    public CommandPart createPart(String s, List<? extends Annotation> list) {
        return new MotdTypePart(s);
    }
}
