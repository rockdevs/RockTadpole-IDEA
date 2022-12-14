package az.rock.ide.view.ui.panel;

import az.rock.ide.view.ui.GComponentInitializer;
import az.rock.ide.common.log.Logger;
import az.rock.ide.view.ui.Loadable;
import az.rock.ide.butterfly.model.DataObject;

import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import java.awt.event.*;

public abstract class GPanel extends JPanel implements GComponentInitializer, Loadable ,ActionListener,GResponse<DataObject>{
    public GPanel(){
        this.setVisible(true);
    }

    {
        this.addAncestorListener(new AncestorListener() {
            @Override
            public void ancestorAdded(AncestorEvent event) {
                //Logger.info(event);
            }

            @Override
            public void ancestorRemoved(AncestorEvent event) {
                //Logger.info(event);
            }

            @Override
            public void ancestorMoved(AncestorEvent event) {
                //Logger.info(event);
            }
        });

        this.addComponentListener(new ComponentListener() {
            @Override
            public void componentResized(ComponentEvent e) {
                //Logger.info(e);
            }

            @Override
            public void componentMoved(ComponentEvent e) {
                //Logger.info(e);
            }

            @Override
            public void componentShown(ComponentEvent e) {
                //Logger.info(e);
            }

            @Override
            public void componentHidden(ComponentEvent e) {
                //Logger.info(e);
            }
        });

        this.addContainerListener(new ContainerListener() {
            @Override
            public void componentAdded(ContainerEvent e) {
                //Logger.info(e);
            }

            @Override
            public void componentRemoved(ContainerEvent e) {
                //Logger.info(e);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Logger.info(e);
    }

    public void updateState(){
        this.updateUI();
    }

    @Override
    public void init() {
        this.postConst();
        this.componentInitializer();
        this.updateUI();
    }
    
    
     

}
