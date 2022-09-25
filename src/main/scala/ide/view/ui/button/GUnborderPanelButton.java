package az.rock.ide.view.ui.button;

import az.rock.ide.view.ui.StaticUIFrame;

import javax.swing.*;
import java.awt.*;

public class GUnborderPanelButton extends GSimpleButton {
    {
        this.setBorder(BorderFactory.createEmptyBorder(7,15,7,7));
        this.setBackground(StaticUIFrame.getPanelBakground().darker());
    }

    public GUnborderPanelButton(String text){
        super(text);
        this.setFont(new Font("Helvetica",Font.TRUETYPE_FONT,14));
        this.setHorizontalAlignment(SwingConstants.LEFT);
    }
}
