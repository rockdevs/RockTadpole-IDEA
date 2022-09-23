package az.rock.ide.engine.container.model;

import az.rock.ide.engine.container.ProcessContainer;
import az.rock.ide.engine.container.driven.SecondaryProcess;
import lombok.Getter;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Getter
public class SecondaryProcessModel extends ProcessModel {
    private UUID primaryUUID;
    private SecondaryProcess secondaryProcess;

    private SecondaryProcessModel(UUID parentUUID, SecondaryProcess process){
        super();
        this.parentUUID = parentUUID;
        this.secondaryProcess = process;
    }

    public static SecondaryProcessModel buildProcess(UUID parentUUID, SecondaryProcess process){
        SecondaryProcessModel subProcessModel = new SecondaryProcessModel(parentUUID,process);
        ProcessContainer.register(subProcessModel);
        return subProcessModel;
    }


    @Override
    public void appendSecondaryProcess(SecondaryProcess secondaryProcess) {
        
    }

    @Override
    public void removeSecondaryProcess(SecondaryProcess secondaryProcess) {
        
    }

    @Override
    public void clear(SecondaryProcess secondaryProcess) {
        
    }
}
