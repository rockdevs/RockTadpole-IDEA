package az.rock.ide.view.ui.bar;

import az.rock.ide.engine.task.GComponentInitializer;

import javax.swing.*;
import az.rock.ide.view.page.screen.Loadable;
public abstract  class GMenuBar extends JMenuBar implements GComponentInitializer, Loadable {
    public GMenuBar(){
        super();
    }

    @Override
    public JMenu add(JMenu c) {
        return super.add(c);
    }

    @Override
    public void init() {
        this.postConst();
        this.componentInitializer();
        this.setVisible(true);
    }
}