package az.rock.ide.view.ui;

import javax.swing.*;
import java.awt.*;

public class StaticUIFrame {
    private static JFrame frame = new JFrame();
    private static JPanel panel = new JPanel();
    
    public static Color getBackgroud(){
        return frame.getBackground();
    }

    public static Color getPanelBakground(){
        return panel.getBackground();
    }
    
    public static Color getSlimColor(){
        return frame.getGraphics().getColor();
    }


}
