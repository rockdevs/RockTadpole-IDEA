package az.rock.ide.engine.task;

import com.formdev.flatlaf.FlatDarculaLaf;

import javax.swing.*;

public class ViewProvider implements Initializer{
    public static void postViewDefaultInitializer(){
        try {
            UIManager.setLookAndFeel(new FlatDarculaLaf());
        } catch (UnsupportedLookAndFeelException e) {
            JOptionPane.showMessageDialog(new JFrame("Error")," There was exception while initialize windows");
        }
    }
    
    @Override
    public void init() {

    }
}
