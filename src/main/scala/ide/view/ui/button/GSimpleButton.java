package az.rock.ide.view.ui.button;

import az.rock.ide.view.ui.icon.enums.GIconBar;

import javax.swing.*;
import java.awt.*;

public class GSimpleButton extends GButton{
    public GSimpleButton(String text){
        super(text);
    }

    public GSimpleButton(GIconBar gIconBar){
        super(gIconBar);
    }
    
    public GSimpleButton(String text, GIconBar gIconBar){
        super(text,gIconBar);
    }

    public GSimpleButton(GIconBar gIconBar,String text){
        super(text,gIconBar);
    }

}
