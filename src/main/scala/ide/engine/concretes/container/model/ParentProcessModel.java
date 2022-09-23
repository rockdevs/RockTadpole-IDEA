package az.rock.ide.engine.concretes.container.model;

import az.rock.ide.common.log.Logger;
import az.rock.ide.engine.concretes.task.ChildProcess;
import az.rock.ide.engine.concretes.task.Process;
import lombok.Getter;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Getter
public class ParentProcessModel extends ProcessModel{
    private Process process;
    private Set<ChildProcess> subProcess = new HashSet<>();

    private ParentProcessModel(Process process){
        super();
        this.process = process;
        Logger.spec("ProcessModel was initialized with ID : ".concat(super.getUuid().toString()));
    }


    public static ParentProcessModel buildProcess(Process process){
        return new ParentProcessModel(process);
    }

    public void addChildProcess(ChildProcess childProcess){
        //childProcess.
        this.subProcess.add(childProcess);
    }

    public void removeChildProcess(ChildProcess childProcess){
        
        this.subProcess.remove(childProcess);
    }

    public void clear(ChildProcess childProcess){
        this.subProcess.clear();
    }

}
