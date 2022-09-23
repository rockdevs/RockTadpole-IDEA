package az.rock.ide.engine.container.model;

import az.rock.ide.common.log.Logger;
import az.rock.ide.engine.container.driven.PrimaryProcess;
import az.rock.ide.engine.container.driven.SecondaryProcess;
import az.rock.ide.engine.container.driven.Process;
import lombok.Getter;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Getter
public final class PrimaryProcessModel extends ProcessModel{
    private PrimaryProcess primaryProcess;

    private PrimaryProcessModel(Process primaryProcess){
        super();
        this.primaryProcess = primaryProcess;
    }


    public static PrimaryProcessModel buildProcess(Process process){
        PrimaryProcessModel primaryProcessModel = new PrimaryProcessModel(process);
        return primaryProcessModel;
    }

    
    
    @Override
    public void appendSecondaryProcess(SecondaryProcess secondaryProcess) {
        Logger.spec("Append SecondaryProcess on PrimaryProcess with UUID :".concat(super.getUuid().toString()));
    }

    @Override
    public void removeSecondaryProcess(SecondaryProcess secondaryProcess) {
        Logger.spec("Remove SecondaryProcess on PrimaryProcess with UUID :".concat(super.getUuid().toString()));
    }

    @Override
    public void clear() {
        Logger.spec("Clear All SecondaryProcesses on PrimaryProcess with UUID :".concat(super.getUuid().toString()));
    }
}
