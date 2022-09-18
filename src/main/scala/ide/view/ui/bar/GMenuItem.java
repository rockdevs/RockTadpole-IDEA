package az.rock.ide.view.ui.bar;

import javax.swing.*;
import java.awt.*;

public class GMenuItem extends JMenuItem {
    public GMenuItem(Icon icon){
        super(icon);
    }

    public GMenuItem(String text){
        super(text);
    }

    public GMenuItem(String text,ImageIcon icon){
        super(text);
        this.setIcon(icon);
    }


}