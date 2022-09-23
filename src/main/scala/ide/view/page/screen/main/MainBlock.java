package az.rock.ide.view.page.screen.main;

import az.rock.ide.engine.task.Initializer;
import az.rock.ide.view.ui.panel.GPanel;
import az.rock.ide.view.page.screen.main.central.CentralPanel;
import az.rock.ide.view.page.screen.main.side.south.SouthPanel;
import az.rock.ide.view.page.screen.main.side.east.EastPanel;
import az.rock.ide.view.page.screen.main.side.north.NorthPanel;
import az.rock.ide.view.page.screen.main.side.west.WestPanel;

import java.awt.*;
import java.util.stream.Stream;

public class MainBlock extends GPanel {
    private final NorthPanel northPanel = new NorthPanel();
    private final WestPanel westPanel = new WestPanel();
    private final EastPanel eastPanel = new EastPanel();
    private final SouthPanel southPanel = new SouthPanel();

    private final CentralPanel centralPanel = new CentralPanel();
    public MainBlock(){
        super();
        this.setLayout(new BorderLayout());
        this.add(this.northPanel,BorderLayout.NORTH);
        this.add(this.eastPanel,BorderLayout.EAST);
        this.add(this.westPanel,BorderLayout.WEST);
        this.add(this.southPanel,BorderLayout.SOUTH);

        this.add(this.centralPanel,BorderLayout.CENTER);
    }



    @Override
    public void postConst() {

    }

    @Override
    public void componentInitializer() {
        Stream.of(northPanel,southPanel,eastPanel,westPanel,centralPanel)
                .forEach(Initializer::init);
    }
}
