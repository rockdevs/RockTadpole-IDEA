package az.rock.ide.view.ui;

import javax.swing.*;

public class GFileChooser extends JFileChooser {
    private  JPanel parent;

    {
        this.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
    }

    public GFileChooser(JPanel parent){
        this.parent=parent;
    }
}
