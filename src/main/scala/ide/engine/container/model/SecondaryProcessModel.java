package az.rock.ide.engine.container.model;

import az.rock.ide.common.log.Logger;
import az.rock.ide.engine.container.ProcessContainer;
import az.rock.ide.engine.container.driven.SecondaryProcess;
import lombok.Getter;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Getter
public final class SecondaryProcessModel extends ProcessModel {
    private UUID parentUUID;
    private SecondaryProcess secondaryProcess;

    private SecondaryProcessModel(UUID parentUUID, SecondaryProcess secondaryProcess){
        super();
        this.parentUUID = parentUUID;
        this.secondaryProcess = secondaryProcess;
    }

    public static SecondaryProcessModel buildProcess(UUID parentUUID, SecondaryProcess process){
        SecondaryProcessModel subProcessModel = new SecondaryProcessModel(parentUUID,process);
        return subProcessModel;
    }


    @Override
    public void appendSecondaryProcess(SecondaryProcess secondaryProcess) {
        Logger.spec("Append SecondaryProcess on SecondaryProcess with UUID :".concat(super.getUuid().toString()));
    }

    @Override
    public void removeSecondaryProcess(SecondaryProcess secondaryProcess) {
        Logger.spec("Remove SecondaryProcess on SecondaryProcess with UUID :".concat(super.getUuid().toString()));
    }

    @Override
    public void clear() {
        Logger.spec("Clear All SecondaryProcesses on SecondaryProcess with UUID :".concat(super.getUuid().toString()));
    }
}
