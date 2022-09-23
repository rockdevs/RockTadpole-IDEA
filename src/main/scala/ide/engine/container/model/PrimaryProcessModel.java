package az.rock.ide.engine.container.model;

import az.rock.ide.common.log.Logger;
import az.rock.ide.engine.container.driven.PrimaryProcess;
import az.rock.ide.engine.container.driven.SecondaryProcess;
import az.rock.ide.engine.container.driven.Process;
import lombok.Getter;

import java.util.HashSet;
import java.util.Set;

@Getter
public class PrimaryProcessModel extends ProcessModel{
    private PrimaryProcess primaryProcess;
    

    private PrimaryProcessModel(Process process){
        super();
        this.process = process;
    }


    public static PrimaryProcessModel buildProcess(Process process){
        return new PrimaryProcessModel(process);
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
