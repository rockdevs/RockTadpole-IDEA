package az.rock.ide.view.ui.button;

import az.rock.ide.view.ui.icon.enums.GIconBar;
import az.rock.ide.view.util.ImageProvider;

import javax.swing.*;
import java.util.Objects;

public class GButton extends JButton {
    public GButton(){
        super();
    }

    public GButton(String text){
        super(text);
    }

    public GButton(String text, GIconBar iconBar){
        this(text);
        this.setIcon(new ImageIcon(Objects.requireNonNull(ImageProvider.getImage(iconBar.path()))));
    }

    public GButton(GIconBar iconBar){
        this();
        this.setIcon(new ImageIcon(Objects.requireNonNull(ImageProvider.getImage(iconBar.path()))));
    }


}
