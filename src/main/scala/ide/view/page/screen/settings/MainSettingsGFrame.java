package az.rock.ide.view.page.screen.settings;

import az.rock.ide.view.page.lib.panel.GSimplePanel;
import az.rock.ide.view.page.screen.settings.mainPanels.*;
import az.rock.ide.view.ui.frame.*;

import javax.swing.*;
import java.awt.*;

public class MainSettingsGFrame extends MonoGFrame {

    private final GSimplePanel sidePanel = new SettingsSideGPanel();
    private final SettingMainGPanel mainPanel = new ThemeMainSettingsGPanel();

    {
        this.setLayout(new BorderLayout());
        this.add(this.sidePanel,BorderLayout.WEST);
        this.add(this.mainPanel,BorderLayout.CENTER);
    }

    public MainSettingsGFrame(){
        super("Settings");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }


    @Override
    public void componentInitializer() {
        this.sidePanel.init();
        this.mainPanel.init();
    }

    @Override
    public void postConst() {

    }
}
