package az.rock.ide.view.ui.frame;

import az.rock.ide.view.page.lib.frame.Compiler;
import az.rock.ide.view.page.screen.Loadable;
import javax.swing.*;

public abstract class GFrame extends JFrame implements Compiler, Loadable {
    public GFrame(String header){
        super(header);
    }
    public GFrame(){
        super();
    }

    @Override
    public void compile() {
        this.postConst();
        this.initializer();
        this.setVisible(true);
    }
}
