package az.rock.ide.view.page.screen.main.side.north;

import az.rock.ide.view.page.lib.bar.NavigableGBar;
import az.rock.ide.view.page.lib.other.GComboBox;
import az.rock.ide.view.ui.button.GButton;
import az.rock.ide.view.ui.button.GIconButton;
import az.rock.ide.view.ui.icon.enums.GIconBar;

import java.util.stream.Stream;

public class NorthNavBar extends NavigableGBar  {
    private final GButton buildButton = new GIconButton(GIconBar.COMPILE);
    private final GButton runButton = new GIconButton(GIconBar.EXECUTE);
    private final GComboBox<String> comboBox = new GComboBox<>(new String[]{});
    private final GButton debugButton = new GIconButton(GIconBar.DEBUG);
    private final GButton stopButton = new GIconButton(GIconBar.STOP);
    private final GButton rollbackButton = new GIconButton(GIconBar.RESUME);
    private final GButton searchButton = new GIconButton(GIconBar.TEST);
    private final GButton updatesButton = new GIconButton(GIconBar.UPDATE);

    public NorthNavBar(){
        super();
        Stream.of(buildButton,runButton,comboBox,debugButton,stopButton,rollbackButton,searchButton,updatesButton)
                .forEach(this::add);
    }

    @Override
    public void postConst() {

    }

    @Override
    public void initializer() {

    }
}
