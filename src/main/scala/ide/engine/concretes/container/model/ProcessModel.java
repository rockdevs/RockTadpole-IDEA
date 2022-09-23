package az.rock.ide.engine.concretes.container.model;

import lombok.Getter;

import java.util.UUID;

@Getter
public class ProcessModel {
    private final UUID uuid;
    public ProcessModel(){
        this.uuid = UUID.randomUUID();
    }
    public final boolean match(UUID uuid){
        return this.uuid.equals(uuid);
    }
}
