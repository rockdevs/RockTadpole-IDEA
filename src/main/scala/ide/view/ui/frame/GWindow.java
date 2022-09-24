package az.rock.ide.view.ui.frame;

import javax.swing.*;
import az.rock.ide.view.ui.Loadable;
public abstract class GWindow extends JWindow implements Compiler , Loadable {

    public GWindow(){
        super();
    }

    @Override
    public void compile() {
        this.postConst();
        this.componentInitializer();
        this.setVisible(true);
    }
}
