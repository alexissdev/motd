package dev.notcacha.motd.api;

public interface Service {

    void start();

    default void stop() {

    }
}
