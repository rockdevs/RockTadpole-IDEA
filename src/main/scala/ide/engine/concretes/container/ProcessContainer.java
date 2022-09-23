package az.rock.ide.engine.concretes.container;

import az.rock.ide.engine.concretes.container.model.ChildProcessModel;
import az.rock.ide.engine.concretes.container.model.ParentProcessModel;

import java.util.ArrayList;
import java.util.List;

public class ProcessContainer {
    private static final List<ParentProcessModel> PROCESS_CONTAINER = new ArrayList<>();

    public  static void register(ParentProcessModel process){
        PROCESS_CONTAINER.add(process);
    }

    public  static void register(ChildProcessModel process){
        PROCESS_CONTAINER.add(process);
    }

    public static void dispose(ParentProcessModel process){
        PROCESS_CONTAINER.remove(process);;
    }
}
