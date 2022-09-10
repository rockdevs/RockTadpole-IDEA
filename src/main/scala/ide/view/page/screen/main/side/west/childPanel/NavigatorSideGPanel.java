package az.rock.ide.view.page.screen.main.side.west.childPanel;

import javax.swing.*;
import java.awt.*;

public class NavigatorSideGPanel extends AbstractSideChildGPanel {

    private final String title = " Project Manager";
    private final JScrollPane scrollPane;
    private final JTree tree = new ProjectGTree();

    public NavigatorSideGPanel(){
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

    @Override
    public String getTitle() {
        return title;
    }
}
