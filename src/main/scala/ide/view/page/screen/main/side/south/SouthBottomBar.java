package az.rock.ide.view.page.screen.main.side.south;

import az.rock.ide.view.page.lib.panel.GPanel;
import az.rock.ide.view.ui.button.GButton;
import az.rock.ide.view.ui.button.GIconButton;
import az.rock.ide.view.ui.icon.enums.GIconBar;

import javax.swing.*;
import java.awt.*;
import java.util.stream.Stream;

public class SouthBottomBar extends GPanel {

    private final GButton sideButton = new GIconButton(GIconBar.ANY_TYPE);
    private final JLabel operationInformationLabel = new JLabel("Build completed successful in ..");


    public SouthBottomBar(){
        this.setLayout(new FlowLayout(FlowLayout.LEFT));
        Stream.of(this.sideButton,operationInformationLabel)
                .forEach(this::add);
    }

    @Override
    public void postConst() {

    }

    @Override
    public void componentInitializer() {

    }
}
