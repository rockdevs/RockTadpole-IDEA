package az.rock.ide.view.ui.frame;

import az.rock.ide.engine.concretes.task.ChildProcess;
import az.rock.ide.engine.concretes.task.Process;
import az.rock.ide.view.page.screen.Loadable;
import javax.swing.*;
import java.awt.event.*;

public abstract class GFrame extends JFrame implements ActionListener, Compiler, Loadable   {
    

    {
        this.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {

            }

            @Override
            public void windowClosing(WindowEvent e) {

            }

            @Override
            public void windowClosed(WindowEvent e) {

            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {
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


    public GFrame(){
        super("RockFrame");
    }

    public GFrame(String header){
        super(header);
    }



    @Override
    public void compile() {
        this.postConst();
        this.componentInitializer();
        this.setVisible(true);
    }

}
