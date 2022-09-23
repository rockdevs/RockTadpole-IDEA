package az.rock.ide.engine.container.model;

import az.rock.ide.common.log.Logger;
import az.rock.ide.engine.container.driven.Process;
import az.rock.ide.engine.container.driven.SecondaryProcess;
import lombok.Getter;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Getter
public abstract class ProcessModel<T extends Process> {
    private final UUID uuid;
    private final Set<T> secondaryProcesses = new HashSet<T>();

    public ProcessModel(){
        this.uuid = UUID.randomUUID();
        Logger.spec("ProcessModel was initialized with ID : ".concat(this.getUuid().toString()));
    }

    public final boolean match(UUID uuid){
        return this.uuid.equals(uuid);
    }

    public abstract void appendSecondaryProcess(SecondaryProcess secondaryProcess);
    public abstract void removeSecondaryProcess(SecondaryProcess secondaryProcess);
    public abstract void clear(SecondaryProcess secondaryProcess);
}
