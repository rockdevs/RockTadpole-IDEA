package az.rock.ide.view.ui.frame;

import az.rock.ide.engine.container.ProcessContainer;
import az.rock.ide.engine.container.process.PrimaryProcess;
import az.rock.ide.engine.container.model.PrimaryProcessModel;
import lombok.Getter;

@Getter
public abstract class GPrimaryProcessFrame extends GFrame implements PrimaryProcess {
    private PrimaryProcessModel processModel;
    
    public GPrimaryProcessFrame(){
        super();
    }

    public GPrimaryProcessFrame(String header){
        super(header);
        processModel = PrimaryProcessModel.buildProcessModel(this);
        ProcessContainer.register(processModel);
    }

    @Override
    public void drive() {

    }

    @Override
    public void disposeProcess() {
    }
}
