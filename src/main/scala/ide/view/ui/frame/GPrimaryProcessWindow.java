package az.rock.ide.view.ui.frame;

import az.rock.ide.common.log.Logger;
import az.rock.ide.engine.container.ProcessContainer;
import az.rock.ide.engine.container.model.PrimaryProcessModel;
import az.rock.ide.engine.container.process.PrimaryProcess;
import lombok.Getter;

import java.awt.*;
import java.awt.geom.RoundRectangle2D;

@Getter
public abstract class GPrimaryProcessWindow extends GWindow implements PrimaryProcess {
    private String frameName = "{Empty}";
    private PrimaryProcessModel processModel;

    public GPrimaryProcessWindow() {
        super();
        processModel = PrimaryProcessModel.buildProcessModel(this);
        ProcessContainer.register(processModel);
        this.setSize(800,500);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.DARK_GRAY);
        this.setShape(new RoundRectangle2D.Double(0, 0, 800, 400, 50, 50));
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
        if (obj instanceof GPrimaryProcessWindow frame){
            return frame.processModel.getUuid().equals(this.processModel.getUuid());
        }
        return false;
    }
    
    
}
