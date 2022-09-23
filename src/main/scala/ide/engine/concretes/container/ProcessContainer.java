package az.rock.ide.engine.concretes.container;

import az.rock.ide.engine.concretes.container.model.ChildProcessModel;
import az.rock.ide.engine.concretes.container.model.ParentProcessModel;
import az.rock.ide.engine.concretes.container.model.ProcessModel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProcessContainer {
    private static final List<ProcessModel> PROCESS_CONTAINER = new ArrayList<>();

    public  static void register(ParentProcessModel process){
        PROCESS_CONTAINER.add(process);
    }

    public  static void register(ChildProcessModel process){
        ParentProcessModel parentProcessModel = ProcessContainer.findParentProcessModel(process);
        parentProcessModel.addChildProcess(process.getChildProcess());
        //PROCESS_CONTAINER
    }

    public static void dispose(ParentProcessModel process){
        PROCESS_CONTAINER.remove(process);;
        process.getProcess();
    }

    private static ParentProcessModel findParentProcessModel(ChildProcessModel childProcessModel){
        for (ProcessModel model:PROCESS_CONTAINER){
            if (model.match(childProcessModel.getParentUUID()))
                return (ParentProcessModel) model;
        }
        return null;
    }
}
