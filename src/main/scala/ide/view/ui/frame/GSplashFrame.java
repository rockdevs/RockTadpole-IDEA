package az.rock.ide.view.ui.frame;

import java.awt.*;
import java.awt.geom.RoundRectangle2D;

public abstract class GSplashFrame extends GWindow {
    public GSplashFrame() {
        super();
        this.setSize(800,500);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.DARK_GRAY);
        this.setShape(new RoundRectangle2D.Double(0, 0, 800, 400, 50, 50));
    }
}
