package az.rock.ide.view.ui.frame;

import az.rock.ide.engine.concretes.container.ProcessContainer;
import az.rock.ide.engine.concretes.container.model.ParentProcessModel;
import az.rock.ide.engine.concretes.task.Process;

public abstract class GProcessFrame extends GFrame implements Process {
    private ParentProcessModel parentProcessModel;
    
    public GProcessFrame(){
        super();
    }

    public GProcessFrame(String header){
        super(header);
        parentProcessModel = ParentProcessModel.buildProcess(this);
        ProcessContainer.register(this.parentProcessModel);
    }

    @Override
    public void drive() {

    }

    @Override
    public void disposeProcess() {
    }
}
