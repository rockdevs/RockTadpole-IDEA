package az.rock.ide.view.page.screen.main.side.west;

import az.rock.ide.view.page.lib.panel.GPanel;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class SlidePanel extends GPanel {
    private final GPanel topPanel = new SlideTopPanel();
    private final GPanel mainPanel = new SlideMainPanel();

    public SlidePanel(){
        this.setBorder(BorderFactory.createEtchedBorder());
        this.setLayout(new BorderLayout());
        this.add(this.topPanel,BorderLayout.NORTH);
        this.add(this.mainPanel,BorderLayout.SOUTH);
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
