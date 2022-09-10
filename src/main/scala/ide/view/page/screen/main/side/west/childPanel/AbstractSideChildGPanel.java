package az.rock.ide.view.page.screen.main.side.west.childPanel;

import az.rock.ide.view.page.lib.panel.GPanel;

import javax.swing.*;

public abstract class AbstractSideChildGPanel extends GPanel {

    private  String title = "-";
    public AbstractSideChildGPanel(){
        super();
    }

    public String getTitle() {
        return title;
    }
}
