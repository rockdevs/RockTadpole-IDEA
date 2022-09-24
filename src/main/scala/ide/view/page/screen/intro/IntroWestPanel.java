package az.rock.ide.view.page.screen.intro;

import az.rock.ide.view.ui.button.GButton;
import az.rock.ide.view.ui.button.GSimpleButton;
import az.rock.ide.view.ui.frame.GFrame;
import az.rock.ide.view.ui.frame.GPrimaryProcessFrame;
import az.rock.ide.view.ui.icon.enums.GIconBar;
import az.rock.ide.view.ui.panel.GPanel;
import az.rock.ide.view.ui.panel.GSimplePanel;

import javax.swing.*;
import java.awt.*;

public class IntroWestPanel extends GPanel {
    private final GFrame ownerFrame;
    private final GSimplePanel buttonPanel = new GSimplePanel();
    private final JScrollPane scrollPane;

    private final GButton javaProjectButton = new GSimpleButton("Maven Project", GIconBar.MAVEN);
    private final GButton mavenProjectButton = new GSimpleButton("Java Project",GIconBar.JAVA);
    private final GButton scalaProjectButton = new GSimpleButton("Scala Project",GIconBar.SCALA);

    public IntroWestPanel(GFrame ownerFrame){
        this.ownerFrame = ownerFrame;
        this.scrollPane = new JScrollPane(this.buttonPanel);
        this.add(this.scrollPane);
    }

    @Override
    public void componentInitializer() {
        this.buttonPanel.setLayout(new GridLayout(20, 1, 0, 0));
        this.buttonPanel.add(this.mavenProjectButton);
        this.buttonPanel.add(this.javaProjectButton);
        this.buttonPanel.add(this.scalaProjectButton);
    }

    @Override
    public void postConst() {

    }
}
