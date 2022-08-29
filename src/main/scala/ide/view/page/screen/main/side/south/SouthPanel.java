package az.rock.ide.view.page.screen.main.side.south;

import az.rock.ide.run.concretes.task.Initializer;
import az.rock.ide.view.page.lib.panel.GSidePanel;

import java.awt.*;
import java.util.stream.Stream;

public class SouthPanel extends GSidePanel {
    private final ButtonBarGroup buttonBarGroup = new ButtonBarGroup();

    public SouthPanel(){
        this.add(buttonBarGroup);
        this.setLayout(new FlowLayout(FlowLayout.LEFT));
    }

    @Override
    public void postConst() {

    }

    @Override
    public void initializer() {
        Stream.of(this.buttonBarGroup)
                .forEach(Initializer::init);
    }
}