package az.rock.ide.view.page.screen.actions;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClosePanelActionListener implements ActionListener {
    private final JPanel parent;
    public ClosePanelActionListener(JPanel parent){
        this.parent = parent;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.parent.setVisible(false);
    }
}