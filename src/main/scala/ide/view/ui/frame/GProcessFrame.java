package az.rock.ide.view.ui.frame;

import az.rock.ide.engine.concretes.container.ProcessContainer;
import az.rock.ide.engine.concretes.container.model.ParentProcessModel;

public abstract class GProcessFrame extends GFrame {
    private ParentProcessModel parentProcessModel;
    
    public GFrame(){
        super();
    }

    public GFrame(String header){
        super(header);
        parentProcessModel = ParentProcessModel.buildProcess(this);
        ProcessContainer.register(this.parentProcessModel);
    }
}
