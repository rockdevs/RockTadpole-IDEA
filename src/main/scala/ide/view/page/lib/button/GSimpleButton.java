package az.rock.ide.view.page.lib.button;

import az.rock.ide.view.ui.button.GButton;
import az.rock.ide.view.ui.icon.enums.GIconBar;

public class GSimpleButton extends GButton {
    public GSimpleButton(GIconBar iconBar, String name){
        super(name,iconBar);
    }
    public GSimpleButton(GIconBar iconBar){
        super(iconBar);
    }
}
