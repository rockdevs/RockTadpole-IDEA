package az.rock.ide.view.page.lib.frame;

import az.rock.ide.view.page.screen.Loadable;

import javax.swing.*;

public abstract class GWindow extends JWindow implements Compiler , Loadable {

    public GWindow(){
        super();
    }

    @Override
    public void compile() {
        this.postConst();
        this.initializer();
        this.setVisible(true);
    }
}
