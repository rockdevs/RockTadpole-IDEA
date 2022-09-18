package az.rock.ide.view.ui;

import az.rock.ide.view.page.lib.panel.GSimplePanel;
import az.rock.ide.view.ui.button.GButton;
import az.rock.ide.view.ui.button.GIconButton;
import az.rock.ide.view.ui.icon.enums.GIconBar;
import az.rock.ide.view.ui.textField.GTextField;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GFileChooserPanel extends GSimplePanel {
    private final JPanel parent;
    private final GFileChooser fileChooser;
    private final GTextField textField = new GTextField();
    private final GButton selectLocation = new GIconButton(GIconBar.ANY_TYPE);

    {
        this.setLayout(new BorderLayout());
        this.add(this.textField,BorderLayout.CENTER);
        this.add(this.selectLocation,BorderLayout.EAST);
    }

    {
        this.selectLocation.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result = fileChooser.showOpenDialog(parent);
                textField.setText(fileChooser.getSelectedFile().getAbsolutePath());
            }
        });
    }

    public GFileChooserPanel(JPanel parent){
        this.parent=parent;
        this.fileChooser = new GFileChooser(parent);
    }
}
