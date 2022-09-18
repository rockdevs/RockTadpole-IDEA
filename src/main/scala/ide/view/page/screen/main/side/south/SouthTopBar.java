package az.rock.ide.view.page.screen.main.side.south;

import az.rock.ide.view.ui.panel.GPanel;
import az.rock.ide.view.ui.button.GButton;
import az.rock.ide.view.ui.icon.enums.GIconBar;

import az.rock.ide.view.ui.button.GSimpleButton;
import java.awt.*;
import java.util.stream.Stream;

public class SouthTopBar extends GPanel {

    private final GButton gitButton = new GSimpleButton(GIconBar.GIT,"Git");
    private final GButton runButton = new GSimpleButton(GIconBar.EXECUTE,"Run");
    private final GButton profilerButton = new GSimpleButton(GIconBar.PERSONS,"Profiler");
    private final GButton buildButton = new GSimpleButton(GIconBar.COMPILE,"Build");
    private final GButton dependenciesButton = new GSimpleButton(GIconBar.INSTALL,"Dependencies");
    private final GButton todoButton = new GSimpleButton(GIconBar.RESUME,"TODO");
    private final GButton problemButton = new GSimpleButton(GIconBar.RED,"Problem");
    private final GButton terminalButton = new GSimpleButton(GIconBar.TEST,"Terminal");
    private final GButton servicesButton = new GSimpleButton(GIconBar.DESKTOP,"Services");

    public SouthTopBar(){
        this.setLayout(new FlowLayout(FlowLayout.LEFT));
        Stream.of(gitButton,runButton,terminalButton,problemButton,buildButton,dependenciesButton,todoButton,servicesButton,profilerButton)
                .forEach(this::add);
    }

    @Override
    public void postConst() {

    }

    @Override
    public void componentInitializer() {

    }
}
