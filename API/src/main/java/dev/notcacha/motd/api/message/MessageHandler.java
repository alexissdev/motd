package dev.notcacha.motd.api.message;

import java.util.List;

public interface MessageHandler {

    String getMessage(String path);

    List<String> getMessages(String path);
}
