package az.rock.ide.view.ui.bar;

import az.rock.ide.view.ui.GComponentInitializer;
import az.rock.ide.view.ui.Loadable;
import javax.swing.*;

public abstract class NavigableGBar extends JToolBar implements GComponentInitializer, Loadable {
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
