package az.rock.ide.view.page.screen.main.side.south;

import az.rock.ide.view.ui.panel.GPanel;

import javax.swing.*;

public class ButtonBarGroup extends GPanel {

    Box verticalBox = Box.createVerticalBox();
    private final GPanel buttonGroupPanel = new SouthTopBar();
    private final GPanel statusPanel = new SouthBottomBar();

    public ButtonBarGroup(){
        super();
        this.verticalBox.add(buttonGroupPanel);
        this.verticalBox.add(statusPanel);
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.add(this.verticalBox);
    }

    @Override
    public void postConst() {

    }

    @Override
    public void componentInitializer() {
    }
}
