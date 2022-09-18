package az.rock.ide.view.ui.bar;

import az.rock.ide.engine.concretes.task.Initializer;
import az.rock.ide.view.page.screen.Loadable;
import javax.swing.*;

public abstract class NavigableGBar extends JToolBar implements Initializer, Loadable {
    public NavigableGBar(){
        super();
    }

    @Override
    public void init() {
        this.postConst();
        this.componentInitializer();
        this.setVisible(true);
    }
}
