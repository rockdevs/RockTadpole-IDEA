package az.rock.ide.engine.container;

import az.rock.ide.common.log.Logger;
import az.rock.ide.engine.container.model.SecondaryProcessModel;
import az.rock.ide.engine.container.model.PrimaryProcessModel;
import az.rock.ide.engine.container.model.ProcessModel;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ProcessContainer {

    private static final List<ProcessModel> PROCESS_MODEL_CONTAINER = new ArrayList<>();



    public static PrimaryProcessModel findPrimaryProcessModelWithUUID(UUID uuid){
        var optionalValue = PROCESS_MODEL_CONTAINER.stream().filter(processModel -> processModel.match(uuid)).findFirst();
        return optionalValue.isPresent()?optionalValue.get():null;
    }




    public  static void register(PrimaryProcessModel process){
        Logger.spec("Register PrimaryProcessModel with UUID :".concat(process.getUuid()));
    }

    public  static void register(SecondaryProcessModel process){

    }

    public static void dispose(PrimaryProcessModel process){
        Logger.spec("Dispose PrimaryProcessModel with UUID :".concat(process.getUuid()));
    }

    public static void dispose(SecondaryProcessModel process){

    }

}
