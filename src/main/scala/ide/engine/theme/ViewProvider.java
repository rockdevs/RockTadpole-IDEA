package az.rock.ide.engine.theme;

import az.rock.ide.view.ui.GComponentInitializer;
import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatArcDarkContrastIJTheme;

import javax.swing.*;

public class ViewProvider {
    public static void postViewDefaultInitializer(){
        try {
            UIManager.setLookAndFeel(Theme.GITHUB_DARK_CONTRAST.get());
        } catch (UnsupportedLookAndFeelException e) {
            JOptionPane.showMessageDialog(new JFrame("Error")," There was exception while initialize windows");
        }
    }
}
