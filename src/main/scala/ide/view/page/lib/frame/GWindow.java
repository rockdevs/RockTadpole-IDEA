package az.rock.ide.view.page.lib.frame;

import javax.swing.*;
import az.rock.ide.view.page.screen.Loadable;
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
