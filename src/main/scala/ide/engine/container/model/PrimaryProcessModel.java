package az.rock.ide.engine.container.model;

import az.rock.ide.common.log.Logger;
import az.rock.ide.engine.container.process.PrimaryProcess;
import az.rock.ide.engine.container.process.SecondaryProcess;
import az.rock.ide.engine.container.process.Process;
import lombok.Getter;

@Getter
public final class PrimaryProcessModel extends ProcessModel{
    private PrimaryProcess primaryProcess;

    private PrimaryProcessModel(PrimaryProcess primaryProcess){
        super();
        this.primaryProcess = primaryProcess;
    }


    public static PrimaryProcessModel buildProcessModel(PrimaryProcess process){
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
