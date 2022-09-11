package az.rock.ide.view.page.screen.main.side.west;

import az.rock.ide.jobs.abst.Logger;
import az.rock.ide.view.page.lib.button.GSimpleButton;
import az.rock.ide.view.page.lib.panel.GSidePanel;
import az.rock.ide.view.page.screen.main.side.west.childPanel.AbstractSideChildGPanel;
import az.rock.ide.view.page.screen.main.side.west.childPanel.FreeSideChildPanel;
import az.rock.ide.view.page.screen.main.side.west.childPanel.NavigatorSideGPanel;
import az.rock.ide.view.ui.button.GButton;
import az.rock.ide.view.ui.icon.enums.GIconBar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.stream.Stream;

public class WestPanel extends GSidePanel {
    private boolean slidePanelVisibility = false;
    private final GButton projectButton = new GSimpleButton(GIconBar.FOLDER);
    private final GButton bookmarksButton = new GSimpleButton(GIconBar.CONFIG_FOLDER);
    private final GButton structuresButton = new GSimpleButton(GIconBar.DESKTOP);

    private final JToolBar toolBar = new JToolBar("Navigator",JToolBar.VERTICAL);
    private SlidePanel slidePanel;

    {
        Stream.of(projectButton,bookmarksButton,structuresButton)
                .forEach(e->this.toolBar.add(e));
    }

    {
        this.projectButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Logger.spec("Call addActionListener Method");
                visibleSlidePanel(new NavigatorSideGPanel());
            }
        });
    }


    public WestPanel() {
        this.slidePanel = SlidePanel.factoryFreeSlidePanel(this);
        this.setLayout(new BorderLayout());
        this.add(toolBar,BorderLayout.WEST);
        this.add(this.slidePanel,BorderLayout.EAST);
        this.setBorder(BorderFactory.createEtchedBorder());
    }

    public void addButton(GButton button){
        this.add(button);
    }

    private final void visibleSlidePanel(AbstractSideChildGPanel childGPanel) {
        this.changePanelComponent(childGPanel);
        this.slidePanel.setVisible(!this.slidePanelVisibility);
        this.slidePanelVisibility = !this.slidePanelVisibility;
        this.updateUI();
    };

    public void changePanelComponent(AbstractSideChildGPanel childGPanel){
        Logger.spec("Call visibleSlidePanel Method");
        this.remove(this.slidePanel);
        this.slidePanel = SlidePanel.factorySlidePanel(this,childGPanel);
        this.add(this.slidePanel,BorderLayout.EAST);
    }


    @Override
    public void postConst() {

    }

    @Override
    public void componentInitializer() {
        this.slidePanel.init();
        this.slidePanel.setVisible(slidePanelVisibility);
    }



}
