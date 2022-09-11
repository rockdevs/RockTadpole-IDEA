package az.rock.ide.view.page.screen.main.side.west;

import az.rock.ide.view.page.lib.panel.GPanel;
import az.rock.ide.view.page.screen.actions.ClosePanelActionListener;
import az.rock.ide.view.page.screen.main.side.west.childPanel.AbstractSideChildGPanel;
import az.rock.ide.view.page.screen.main.side.west.childPanel.FreeSideChildPanel;
import az.rock.ide.view.page.screen.main.side.west.childPanel.NavigatorSideGPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class SlidePanel extends GPanel {
    private GPanel parent;
    private SlideTopPanel topPanel = null;
    private AbstractSideChildGPanel mainPanel = null;

    public static SlidePanel factoryFreeSlidePanel(JPanel parent){
        return new SlidePanel(new FreeSideChildPanel());
    }

    public static SlidePanel factorySlidePanel(JPanel parent,AbstractSideChildGPanel childGPanel){
        SlidePanel slidePanel =  new SlidePanel(childGPanel);
        slidePanel.addCLoseActionListener(new ClosePanelActionListener(parent));
        slidePanel.addHideActionListener(new ClosePanelActionListener(parent));
        return slidePanel;
    }


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

    public void addCLoseActionListener(ActionListener actionListener){
        this.topPanel.addCLoseActionListener(actionListener);
    }

    public void addHideActionListener(ActionListener actionListener){
        this.topPanel.addHideActionListener(actionListener);
    }


}
