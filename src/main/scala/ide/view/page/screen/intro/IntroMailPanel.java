package az.rock.ide.view.page.screen.intro;

import az.rock.ide.view.ui.button.GButton;
import az.rock.ide.view.ui.button.GSquareButton;
import az.rock.ide.view.ui.icon.enums.GIconBar;
import az.rock.ide.view.ui.panel.GSimplePanel;

import javax.swing.*;
import java.awt.*;

public class IntroMailPanel extends GSimplePanel{
    private final GSimplePanel buttonPanel = new GSimplePanel();

    private final GButton openProject = new GSquareButton("Open Project", GIconBar.FOLDER);
    private final GButton newProject = new GSquareButton("New Project",GIconBar.FOLDER);
    private final GButton getRepository = new GSquareButton("Git",GIconBar.GIT);

    {
        openProject.setVerticalTextPosition(SwingConstants.BOTTOM);
        openProject.setHorizontalTextPosition(SwingConstants.CENTER);

        newProject.setVerticalTextPosition(SwingConstants.BOTTOM);
        newProject.setHorizontalTextPosition(SwingConstants.CENTER);

        getRepository.setVerticalTextPosition(SwingConstants.BOTTOM);
        getRepository.setHorizontalTextPosition(SwingConstants.CENTER);
    }

    public IntroMailPanel(){
        this.setLayout(new BorderLayout());
    }

    @Override
    public void componentInitializer() {
        this.buttonPanel.add(this.newProject);
        this.buttonPanel.add(this.openProject);
        this.buttonPanel.add(this.getRepository);
        this.buttonPanel.setLayout(new GridBagLayout());
        this.add(this.buttonPanel,BorderLayout.CENTER);
    }

    @Override
    public void postConst() {

    }
}
