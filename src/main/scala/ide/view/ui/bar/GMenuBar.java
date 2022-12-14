package az.rock.ide.view.ui.bar;

import az.rock.ide.view.ui.GComponentInitializer;

import javax.swing.*;
import az.rock.ide.view.ui.Loadable;
import az.rock.ide.view.ui.frame.GPrimaryProcessFrame;

public abstract  class GMenuBar extends JMenuBar implements GComponentInitializer, Loadable {
    public GMenuBar(GPrimaryProcessFrame primaryProcessFrame){
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