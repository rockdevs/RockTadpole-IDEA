package az.rock.ide.view.page.screen.main.side.west;

import az.rock.ide.view.page.lib.panel.GPanel;

import javax.swing.*;
import java.awt.*;

public class SlideMainPanel extends GPanel {

    private final JScrollPane scrollPane;
    private final JTree tree = new SlideProjectGTree();

    public SlideMainPanel(){
        super();
        this.setLayout(new BorderLayout());
        this.scrollPane = new JScrollPane(this.tree);
        this.add(this.scrollPane,BorderLayout.CENTER);
    }

    @Override
    public void componentInitializer() {

    }

    @Override
    public void postConst() {

    }
}
