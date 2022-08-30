package az.rock.ide.view.page.screen.main.side.west;

import az.rock.ide.view.page.lib.button.GSimpleButton;
import az.rock.ide.view.page.lib.panel.GSidePanel;
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
    private final SlidePanel slidePanel = new SlidePanel();

    {
        Stream.of(projectButton,bookmarksButton,structuresButton)
                .forEach(e->this.toolBar.add(e));
    }

    public WestPanel() {
        this.setLayout(new BorderLayout());
        this.add(toolBar,BorderLayout.WEST);
        this.add(this.slidePanel,BorderLayout.EAST);
        this.setBorder(BorderFactory.createEtchedBorder());
    }

    public void addButton(GButton button){
        this.add(button);
    }

    private final ActionListener visibleSlidePanel = (e -> {
        this.slidePanel.setVisible(!this.slidePanelVisibility);
        this.slidePanelVisibility = !this.slidePanelVisibility;
    });

    @Override
    public void postConst() {
        Stream.of(this.projectButton,this.bookmarksButton,this.structuresButton)
                .forEach(e->e.addActionListener(visibleSlidePanel));

    }

    @Override
    public void initializer() {
        this.slidePanel.init();
        this.slidePanel.setVisible(slidePanelVisibility);
    }
}
