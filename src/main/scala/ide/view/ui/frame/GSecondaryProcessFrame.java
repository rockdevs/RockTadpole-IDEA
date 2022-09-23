package az.rock.ide.view.ui.frame;

import az.rock.ide.engine.container.ProcessContainer;
import az.rock.ide.engine.container.model.PrimaryProcessModel;
import az.rock.ide.engine.container.model.SecondaryProcessModel;
import az.rock.ide.engine.container.process.SecondaryProcess;
import lombok.Getter;

import java.util.UUID;

@Getter
public abstract class GSecondaryProcessFrame extends GFrame implements SecondaryProcess {
    private SecondaryProcessModel processModel;

    public GSecondaryProcessFrame(){
        super();
    }

    public GSecondaryProcessFrame(GPrimaryProcessFrame processFrame,String header){
        super(header);
        UUID parentUUID = UUID.fromString(processFrame.getProcessModel().getUuid());
        this.processModel = SecondaryProcessModel.buildProcess(parentUUID,this);
        ProcessContainer.register(this.processModel);
    }

    @Override
    public void disposeProcess() {

    }

    @Override
    public void drive() {

    }
}
