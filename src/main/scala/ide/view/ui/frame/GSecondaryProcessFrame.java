package az.rock.ide.view.ui.frame;

import az.rock.ide.common.log.Logger;
import az.rock.ide.engine.container.ProcessContainer;
import az.rock.ide.engine.container.model.PrimaryProcessModel;
import az.rock.ide.engine.container.model.SecondaryProcessModel;
import az.rock.ide.engine.container.process.SecondaryProcess;
import lombok.Getter;

import java.util.UUID;

@Getter
public abstract class GSecondaryProcessFrame extends GFrame implements SecondaryProcess {
    private String frameName = "{Empty}";
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
        Logger.spec("SecondaryProcessModel Name -> "+getFrameName()+" (Parent : ".concat(this.processModel.getParentUUID().toString()).concat(") with UUID ").concat(this.processModel.getUuid()).concat(" is driving"));
    }

    @Override
    public void disposeProcess() {
        Logger.spec("SecondaryProcessModel Name -> "+getFrameName()+" (Parent : ".concat(this.processModel.getParentUUID().toString()).concat(") with UUID ").concat(this.processModel.getUuid()).concat(" disposed"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof GSecondaryProcessFrame frame){
            return frame.processModel.getUuid().equals(this.processModel.getUuid());
        }
        return false;
    }
}
