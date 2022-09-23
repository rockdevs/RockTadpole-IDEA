package az.rock.ide.view.ui.frame;

import az.rock.ide.engine.container.ProcessContainer;
import az.rock.ide.engine.container.driven.PrimaryProcess;
import az.rock.ide.engine.container.model.PrimaryProcessModel;

public abstract class GPrimaryProcessFrame extends GFrame implements PrimaryProcess {
    private PrimaryProcessModel superProcessModel;
    
    public GPrimaryProcessFrame(){
        super();
    }

    public GPrimaryProcessFrame(String header){
        super(header);
        superProcessModel = PrimaryProcessModel.buildProcess(this);
        ProcessContainer.register(this.superProcessModel);
    }

    @Override
    public void drive() {

    }

    @Override
    public void disposeProcess() {
    }
}
