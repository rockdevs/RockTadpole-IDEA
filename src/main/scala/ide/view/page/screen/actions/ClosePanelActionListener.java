package az.rock.ide.view.page.screen.actions;

import az.rock.ide.view.page.lib.panel.GPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClosePanelActionListener implements ActionListener {
    private final GPanel parent;
    public ClosePanelActionListener(GPanel parent){
        this.parent = parent;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.parent.setVisible(false);
    }
}