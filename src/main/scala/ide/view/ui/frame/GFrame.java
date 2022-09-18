package az.rock.ide.view.ui.frame;

import az.rock.ide.engine.concretes.ApplicationContainer;
import az.rock.ide.common.log.Logger;
import az.rock.ide.view.page.screen.Loadable;
import javax.swing.*;
import java.awt.event.*;

public abstract class GFrame extends JFrame implements ActionListener, Compiler, Loadable {
    {
        this.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
                Logger.info(e);
            }

            @Override
            public void windowClosing(WindowEvent e) {
                ApplicationContainer.dispose(e.getWindow());
                Logger.info(e);
            }

            @Override
            public void windowClosed(WindowEvent e) {
                Logger.info(e);
            }

            @Override
            public void windowIconified(WindowEvent e) {
                //Logger.info(e);
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                //Logger.info(e);
            }

            @Override
            public void windowActivated(WindowEvent e) {
                ApplicationContainer.register(e.getWindow());
                Logger.info(e);
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                //Logger.info(e);
            }
        });
    }

    public void updateUI(){
        SwingUtilities.updateComponentTreeUI(this);
        this.invalidate();
        this.validate();
        this.repaint();
    }

    public GFrame(String header){
        super(header);
    }
    public GFrame(){
        super();
    }

    @Override
    public void compile() {
        this.postConst();
        this.componentInitializer();
        this.setVisible(true);
    }

}
