package az.rock.ide.view.ui.button;

import az.rock.ide.view.ui.StaticUIFrame;

import javax.swing.*;
import java.awt.*;

public class GUnborderSimpleButton extends GSimpleButton {
    {
        this.setBorder(BorderFactory.createEmptyBorder(2,2,2,2));
        this.setBackground(StaticUIFrame.getBackgroud());
    }

    public GUnborderSimpleButton(String text){
        super(text);
        this.setFont(new Font("Helvetica",Font.TRUETYPE_FONT,10));

    }
}