package az.rock.ide.view.ui;

import javax.swing.*;
import java.awt.*;

public class StaticUIFrame {
    private static JFrame frame = new JFrame();

    public static Color getBackgroud(){
        return frame.getBackground();
    }
}
