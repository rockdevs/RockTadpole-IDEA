package az.rock.ide.view.ui.bar;

import az.rock.ide.core.concretes.task.Initializer;
import az.rock.ide.view.page.screen.Loadable;

import javax.swing.*;

public abstract  class GMenuBar extends JMenuBar implements Initializer, Loadable {
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
        this.initializer();
        this.setVisible(true);
    }
}