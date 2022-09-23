package az.rock.ide.view.ui.frame;

import az.rock.ide.view.ui.bar.ToolGMenuBar;

import java.awt.*;

public abstract class GMainFrame extends GPrimaryProcessFrame {

    private final ToolGMenuBar toolGMenuBar;

    public GMainFrame(String header){
        super(header);
        this.toolGMenuBar = new ToolGMenuBar(this);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setMinimumSize(new Dimension(1400,1000));
        this.setLocationRelativeTo(null);
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setLayout(new BorderLayout());
        this.toolGMenuBar.init();
        this.setJMenuBar(toolGMenuBar);
    }

}
