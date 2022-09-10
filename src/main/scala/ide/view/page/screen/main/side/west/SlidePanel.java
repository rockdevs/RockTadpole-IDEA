package az.rock.ide.view.page.screen.main.side.west;

import az.rock.ide.view.page.lib.panel.GPanel;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class SlidePanel extends GPanel {
    private GPanel topPanel = null;
    private GPanel mainPanel = null;

    public SlidePanel(JPanel parent){
        this.topPanel = new SlideTopPanel(new JLabel(" Project Manager"),this);
        this.mainPanel = new SlideMainPanel(this);
        this.setBorder(BorderFactory.createEtchedBorder());
        this.setLayout(new BorderLayout());
        this.add(this.topPanel,BorderLayout.NORTH);
        this.add(this.mainPanel,BorderLayout.CENTER);
        this.setPreferredSize(new Dimension(300,500));
    }

    @Override
    public void componentInitializer() {
        this.topPanel.init();
        this.mainPanel.init();
    }

    @Override
    public void postConst() {

    }
}
