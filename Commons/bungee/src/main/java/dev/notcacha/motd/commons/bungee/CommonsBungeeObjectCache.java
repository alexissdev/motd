package dev.notcacha.motd.commons.bungee;

import dev.notcacha.motd.api.ObjectCache;
import dev.notcacha.motd.api.model.SavableModel;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public abstract class CommonsBungeeObjectCache<T extends SavableModel> implements ObjectCache<T> {

    private final Map<String, T> modelCache = new HashMap<>();

    @Override
    public Optional<T> getById(String modelId) {
        return Optional.ofNullable(
                modelCache.get(modelId)
        );
    }

    @Override
    public void add(T model) {
        modelCache.put(model.getId(), model);
    }

    @Override
    public void remove(String modelId) {
        modelCache.remove(modelId);
    }

    @Override
    public Set<T> getAllModels() {
        return new HashSet<>(modelCache.values());
    }

    @Override
    public void update(T model) {
        if (modelCache.containsKey(model.getId())) {
            remove(model.getId());
        }

        add(model);
    }
}
