package az.rock.ide.view.ui.fileChooser;

import javax.swing.*;

public class GFileChooser extends JFileChooser {
    private  JPanel parent;
    private JInternalFrame inFrame = new JInternalFrame("", true, true, true, true);
    {
        this.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        this.setApproveButtonText("Select");
        inFrame.add(this);
    }

    public GFileChooser(JPanel parent){
        this.parent=parent;
    }
}
