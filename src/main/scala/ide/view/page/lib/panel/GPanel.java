package az.rock.ide.view.page.lib.panel;

import az.rock.ide.run.concretes.task.Initializer;
import az.rock.ide.view.page.screen.Loadable;
import javax.swing.*;

public abstract class GPanel extends JPanel implements Initializer, Loadable {
    public GPanel(){

    }

    @Override
    public void init() {
        this.postConst();
        this.initializer();
        this.setVisible(true);
    }
}
