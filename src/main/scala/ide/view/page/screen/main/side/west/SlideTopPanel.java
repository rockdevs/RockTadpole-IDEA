package az.rock.ide.view.page.screen.main.side.west;

import az.rock.ide.view.page.lib.panel.GPanel;
import az.rock.ide.view.ui.button.GButton;
import az.rock.ide.view.ui.button.GIconButton;
import az.rock.ide.view.ui.icon.enums.GIconBar;

import javax.swing.*;
import java.awt.*;

public class SlideTopPanel extends GPanel {
    private final GButton  closeButton = new GIconButton(GIconBar.CANCEL);
    private final GButton hideButton = new GIconButton(GIconBar.HIDE);


    public SlideTopPanel(){
        super();
        this.setLayout(new FlowLayout(FlowLayout.RIGHT));
        this.add(this.hideButton);
        this.add(this.closeButton);
        this.add(new JSeparator());
    }

    @Override
    public void componentInitializer() {

    }

    @Override
    public void postConst() {

    }
}
