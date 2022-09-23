package az.rock.ide.engine.container;

import az.rock.ide.engine.container.model.SecondaryProcessModel;
import az.rock.ide.engine.container.model.PrimaryProcessModel;
import az.rock.ide.engine.container.model.ProcessModel;

import java.util.ArrayList;
import java.util.List;

public class ProcessContainer {
    
    private static final List<ProcessModel> PROCESS_MODEL_CONTAINER = new ArrayList<>();
    
    
    public  static void register(PrimaryProcessModel process){
        
    }

    public  static void register(SecondaryProcessModel process){
        
    }

    public static void dispose(PrimaryProcessModel process){
        
    }

    public static void dispose(SecondaryProcessModel process){

    }

    private static PrimaryProcessModel findParentProcessModel(SecondaryProcessModel subProcessModel){
        for (ProcessModel model: PROCESS_MODEL_CONTAINER){
            if (model.match(subProcessModel.getParentUUID()))
                return (PrimaryProcessModel) model;
        }
        return null;
    }
}
