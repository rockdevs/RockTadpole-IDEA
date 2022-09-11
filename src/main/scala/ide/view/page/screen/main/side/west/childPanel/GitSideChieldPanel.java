package az.rock.ide.view.page.screen.main.side.west.childPanel;

import javax.swing.*;
import java.awt.*;

public class GitSideChieldPanel extends AbstractSideChildGPanel{

    private final String title = "Git Command";

    private final JLabel heelloWorldLabel = new JLabel("Hello World :)");

    {
        this.heelloWorldLabel.setAlignmentX(SwingConstants.CENTER);
        this.heelloWorldLabel.setAlignmentY(SwingConstants.CENTER);
    }

    public GitSideChieldPanel(){
        super();
        this.setLayout(new BorderLayout());
        this.add(this.heelloWorldLabel,BorderLayout.CENTER);
    }


    @Override
    public void postConst() {

    }

    @Override
    public void componentInitializer() {

    }

    @Override
    public String getTitle() {
        return title;
    }
}
