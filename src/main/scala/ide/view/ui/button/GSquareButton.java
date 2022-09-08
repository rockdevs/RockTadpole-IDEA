package az.rock.ide.view.ui.button;

import az.rock.ide.view.ui.icon.enums.GIconBar;

import java.awt.*;

public class GSquareButton extends GButton{
    public GSquareButton(String text){
        super(text);
    }

    public GSquareButton(String text, GIconBar gIconBar){
        super(text,gIconBar);
        this.setPreferredSize(new Dimension(100,100));
    }
    public GSquareButton( GIconBar gIconBar){
        super(gIconBar);
    }

    @Override
    public Dimension getPreferredSize() {
        Dimension d = super.getPreferredSize();
        int s = (int)(d.getWidth()<d.getHeight() ? d.getHeight() : d.getWidth());
        return new Dimension (s,s);
    }
}
