package az.rock.ide.view.ui.button;

import az.rock.ide.view.ui.StaticUIFrame;
import az.rock.ide.view.ui.panel.GSimplePanel;

import javax.swing.*;

public class GUnborderButton extends GSimpleButton {
    {
        this.setBorder(BorderFactory.createEmptyBorder());
        this.setBackground(StaticUIFrame.getBackgroud());
    }

    public GUnborderButton(String text){
        super(text);
    }
}
