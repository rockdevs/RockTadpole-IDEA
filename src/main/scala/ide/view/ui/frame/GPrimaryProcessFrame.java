package az.rock.ide.view.ui.frame;

import az.rock.ide.common.log.Logger;
import az.rock.ide.engine.container.ProcessContainer;
import az.rock.ide.engine.container.process.PrimaryProcess;
import az.rock.ide.engine.container.model.PrimaryProcessModel;
import lombok.Getter;

@Getter
public abstract class GPrimaryProcessFrame extends GFrame implements PrimaryProcess {
    private String frameName = "{Empty}";
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
    public void compile() {
        super.compile();
        this.drive();
    }

    @Override
    public void dispose() {
        super.dispose();
        this.disposeProcess();
    }


    @Override
    public void drive() {
        Logger.spec("GPrimaryProcessFrame Name-> "+getFrameName()+" with UUID ".concat(this.processModel.getUuid()).concat(" is driving"));
    }

    @Override
    public void disposeProcess() {
        Logger.spec("GPrimaryProcessFrame Name-> "+getFrameName()+" with UUID ".concat(this.processModel.getUuid()).concat(" disposed"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof GPrimaryProcessFrame frame){
            return frame.processModel.getUuid().equals(this.processModel.getUuid());
        }
        return false;
    }

    public String getFrameName() {
        return frameName;
    }
}
