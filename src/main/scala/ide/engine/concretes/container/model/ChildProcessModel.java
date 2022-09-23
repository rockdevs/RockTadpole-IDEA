package az.rock.ide.engine.concretes.container.model;

import az.rock.ide.engine.concretes.container.ProcessContainer;
import az.rock.ide.engine.concretes.task.ChildProcess;
import az.rock.ide.engine.concretes.task.Process;
import lombok.Getter;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Getter
public class ChildProcessModel {
    private UUID parentUUID;
    private ChildProcess childProcess;
    private Set<ChildProcess> subProcess = new HashSet<>();

    private ChildProcessModel(UUID parentUUID,ChildProcess process){
        super();
        this.parentUUID = parentUUID;
        this.childProcess = process;
    }

    public static ChildProcessModel buildProcess(UUID parentUUID,ChildProcess process){
        ChildProcessModel childProcessModel = new ChildProcessModel(parentUUID,process);
        ProcessContainer.register(childProcessModel);
        return childProcessModel;
    }

    public void addChildProcess(ChildProcess childProcess){
        this.subProcess.add(childProcess);
    }

    public void removeChildProcess(ChildProcess childProcess){

        this.subProcess.remove(childProcess);
    }

    public void clear(ChildProcess childProcess){
        this.subProcess.clear();
    }
}
