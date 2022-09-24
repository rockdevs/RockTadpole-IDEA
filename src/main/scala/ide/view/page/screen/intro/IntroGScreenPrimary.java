package az.rock.ide.view.page.screen.intro;

import az.rock.ide.view.ui.frame.MonoGFrame;
import az.rock.ide.view.ui.panel.GPanel;

import java.awt.*;
import java.awt.event.ActionEvent;

public class IntroGScreenPrimary extends MonoGFrame {


    private final GPanel westPanel = new IntroWestPanel(this);
    private final GPanel mainPanel = new IntroMailPanel();

    {
        this.setDefaultCloseOperation(3);
    }

    public IntroGScreenPrimary(String header){
        super(header);
    }
    @Override
    public void postConst() {
        this.add(this.westPanel, BorderLayout.WEST);
        this.add(this.mainPanel,BorderLayout.CENTER);
    }

    @Override
    public void componentInitializer() {
        this.westPanel.init();
        this.mainPanel.init();
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public String getFrameName() {
        return "IntroGScreenPrimary";
    }
}
