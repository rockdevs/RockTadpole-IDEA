package az.rock.ide.view.page.screen.settings;

import az.rock.ide.view.ui.panel.GSimplePanel;
import az.rock.ide.view.page.screen.settings.mainPanels.SettingGTree;
import javax.swing.*;

public class SettingsSideGPanel extends GSimplePanel {

    private final JScrollPane scrollPane;
    private final JTree tree = new SettingGTree();
    public SettingsSideGPanel(){
        super();
        this.scrollPane = new JScrollPane(this.tree);
        this.add(this.scrollPane);

    }

    @Override
    public void componentInitializer() {
    }

    @Override
    public void postConst() {

    }
}
