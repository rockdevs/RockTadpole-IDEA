package az.rock.ide.engine.concretes.container.model;

import lombok.Getter;

import java.util.UUID;

@Getter
public class ProcessModel {
    private final UUID uuid;
    public ProcessModel(UUID uuid){
        this.uuid = UUID.randomUUID();
    }
}
