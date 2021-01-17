package dev.notcacha.motd.api;

import dev.notcacha.motd.api.model.SavableModel;

import java.util.Optional;
import java.util.Set;

public interface ObjectCache<T extends SavableModel> {

    Optional<T> getById(String modelId);

    void load(String modelId);

    void add(T model);

    void remove(String modelId);

    void update(T model);

    Set<T> getAllModels();
}
