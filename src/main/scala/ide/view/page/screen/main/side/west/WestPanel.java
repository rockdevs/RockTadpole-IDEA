package az.rock.ide.view.page.screen.main.side.west;

import az.rock.ide.view.page.lib.button.GSimpleButton;
import az.rock.ide.view.page.lib.panel.GSidePanel;
import az.rock.ide.view.ui.button.GButton;
import az.rock.ide.view.ui.icon.enums.GIconBar;

import javax.swing.*;
import java.awt.*;
import java.util.stream.Stream;

public class WestPanel extends GSidePanel {
    private final GButton projectButton = new GSimpleButton(GIconBar.FOLDER,"Project");
    private final GButton bookmarksButton = new GSimpleButton(GIconBar.CONFIG_FOLDER,"Bookmarks");
    private final GButton structuresButton = new GSimpleButton(GIconBar.DESKTOP,"Structures");

    private final JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.LEFT,JTabbedPane.WRAP_TAB_LAYOUT);

    {
        this.setBorder(BorderFactory.createLineBorder(Color.gray));

        Stream.of(projectButton,bookmarksButton,structuresButton)
                .forEach(e->this.tabbedPane.add(e,e.getText()));
    }

    public WestPanel() {
        this.add(tabbedPane);
    }

    public void addButton(GButton button){
        this.add(button);
    }

    @Override
    public void postConst() {

    }

    @Override
    public void initializer() {

    }
}
