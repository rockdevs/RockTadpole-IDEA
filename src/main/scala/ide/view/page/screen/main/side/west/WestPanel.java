package az.rock.ide.view.page.screen.main.side.west;

import az.rock.ide.common.log.Logger;
import az.rock.ide.view.ui.panel.GSidePanel;
import az.rock.ide.view.page.screen.main.side.west.childPanel.AbstractSideChildGPanel;
import az.rock.ide.view.page.screen.main.side.west.childPanel.GitSideChieldPanel;
import az.rock.ide.view.page.screen.main.side.west.childPanel.NavigatorSideGPanel;
import az.rock.ide.view.ui.button.GButton;
import az.rock.ide.view.ui.button.GSimpleButton;
import az.rock.ide.view.ui.icon.enums.GIconBar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.stream.Stream;

public class WestPanel extends GSidePanel {
    private boolean slidePanelVisibility = false;
    private final GButton projectButton = new GSimpleButton(GIconBar.FOLDER);
    private final GButton mavenButton = new GSimpleButton(GIconBar.MAVEN);
    private final GButton gitButton = new GSimpleButton(GIconBar.GIT);

    private final JToolBar toolBar = new JToolBar("Navigator",JToolBar.VERTICAL);
    private SlidePanel slidePanel;

    {
        Stream.of(projectButton, mavenButton, gitButton)
                .forEach(e->this.toolBar.add(e));
    }

    {
        this.projectButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Logger.spec("Call projectButton addActionListener Method");
                visibleSlidePanel(new NavigatorSideGPanel());
            }
        });

        this.gitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Logger.spec("Call extrButton addActionListener Method");
                visibleSlidePanel(new GitSideChieldPanel());
            }
        });
    }


    public WestPanel() {
        this.slidePanel = SlidePanel.factoryFreeSlidePanel(this.slidePanel);
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
        this.slidePanel = SlidePanel.factorySlidePanel(this.slidePanel,childGPanel);
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
