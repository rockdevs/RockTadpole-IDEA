package az.rock.ide.engine.container;

import az.rock.ide.common.log.Logger;
import az.rock.ide.engine.container.model.SecondaryProcessModel;
import az.rock.ide.engine.container.model.PrimaryProcessModel;
import az.rock.ide.engine.container.model.ProcessModel;
import az.rock.ide.view.ui.frame.GPrimaryProcessFrame;
import az.rock.ide.view.ui.frame.GSecondaryProcessFrame;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ProcessContainer {

    private static final List<ProcessModel> PROCESS_MODEL_CONTAINER = new ArrayList<>();



    public static PrimaryProcessModel findPrimaryProcessModelWithUUID(UUID uuid){
        var optionalValue = PROCESS_MODEL_CONTAINER.stream().filter(processModel -> processModel.match(uuid)).findFirst();
        return optionalValue.isPresent()?(PrimaryProcessModel)optionalValue.get():null;
    }




    public  static void register(PrimaryProcessModel primaryProcessModel){
        Logger.spec("Register PrimaryProcessModel with UUID :".concat(primaryProcessModel.getUuid()));
    }

    public  static void register(SecondaryProcessModel secondaryProcessModel){
        Logger.spec("Register SecondaryProcessModel with UUID :".concat(secondaryProcessModel.getUuid()));
    }

    public static void dispose(PrimaryProcessModel primaryProcessModel){
        Logger.spec("Dispose PrimaryProcessModel with UUID :".concat(primaryProcessModel.getUuid()));
    }

    public static void dispose(SecondaryProcessModel secondaryProcessModel){
        Logger.spec("Dispose SecondaryProcessModel with UUID :".concat(secondaryProcessModel.getUuid()));
    }

}
