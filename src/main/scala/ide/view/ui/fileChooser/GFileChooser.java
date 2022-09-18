package az.rock.ide.view.ui.fileChooser;

import javax.swing.*;

public class GFileChooser extends JFileChooser {
    private  JPanel parent;

    {
        this.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        this.setApproveButtonText("Select");
    }

    public GFileChooser(JPanel parent){
        this.parent=parent;
    }
}
