package az.rock.ide.view.page.screen.main.side.west;

import az.rock.ide.view.page.lib.panel.GPanel;
import az.rock.ide.view.page.screen.main.side.west.childPanel.AbstractSideChildGPanel;

import javax.swing.*;
import java.awt.*;

public class SlidePanel extends GPanel {
    private GPanel parent;
    private GPanel topPanel = null;
    private AbstractSideChildGPanel mainPanel = null;

    public SlidePanel(AbstractSideChildGPanel showPanel){
        super();
        this.mainPanel = showPanel;
        this.topPanel = new SlideTopPanel(new JLabel(showPanel.getTitle()),this);
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
