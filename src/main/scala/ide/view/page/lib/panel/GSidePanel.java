package az.rock.ide.view.page.lib.panel;

import az.rock.ide.core.concretes.task.Initializer;
import az.rock.ide.view.page.screen.Loadable;

import javax.swing.*;

public abstract class GSidePanel extends JPanel implements Initializer, Loadable {
    public GSidePanel(){
        super();
    }

    @Override
    public void init() {
        this.postConst();
        this.initializer();
    }
}
