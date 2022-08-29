package az.rock.ide.view.page.screen.main.side.north;

import az.rock.ide.core.concretes.task.Initializer;
import az.rock.ide.view.page.lib.panel.GPanel;
import az.rock.ide.view.page.lib.panel.GSidePanel;

import javax.swing.*;
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
    public void initializer() {
        Stream.of(this.navBar)
                .forEach(Initializer::init);
    }
}
