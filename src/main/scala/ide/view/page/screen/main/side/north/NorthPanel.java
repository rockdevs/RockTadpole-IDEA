package az.rock.ide.view.page.screen.main.side.north;

import az.rock.ide.view.ui.GComponentInitializer;
import az.rock.ide.view.ui.panel.GSidePanel;

import java.awt.*;
import java.util.stream.Stream;

public class NorthPanel extends GSidePanel {

    private final NorthNavBar navBar  = new NorthNavBar();

    public NorthPanel(){
        super();
        this.setLayout(new FlowLayout(FlowLayout.RIGHT));
        this.add(this.navBar);
    }

    @Override
    public void postConst() {

    }

    @Override
    public void componentInitializer() {
        Stream.of(this.navBar)
                .forEach(GComponentInitializer::init);
    }
}
