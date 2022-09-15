package az.rock.ide.view.page.screen.toolBar.file.newFile;


import az.rock.ide.view.page.lib.panel.GPanel;
import az.rock.ide.view.page.screen.intro.IntroWestPanel;
import az.rock.ide.view.ui.frame.MonoGFrame;
import az.rock.ide.view.ui.button.*;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;
import java.util.PriorityQueue;

public class NewProjectPanel extends MonoGFrame {

    private JPanel buttonPanel  = new JPanel();
    private GButton nextButton = new GSimpleButton("Next");
    private GButton previewButton = new GSimpleButton("Preview");
    private GButton cancelButton = new GSimpleButton("Cancel");

    private final PriorityQueue<GPanel> priorityQueue = new PriorityQueue<>();

    {
        this.priorityQueue.add(new MainNewProjectPanel());
        this.priorityQueue.add(new MainNewProjectPanel());
        this.priorityQueue.add(new MainNewProjectPanel());

        this.buttonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        this.buttonPanel.add(this.cancelButton);
        this.buttonPanel.add(this.previewButton);
        this.buttonPanel.add(this.nextButton);
        //this.cancelButton.addActionListener(new ClosePanelActionListener(this));
    }


    public NewProjectPanel(String name){
        super(name);
    }


    @Override
    public void postConst() {
        this.add(new IntroWestPanel(this),BorderLayout.WEST);
        this.add(this.priorityQueue.peek(),BorderLayout.CENTER);
        this.add(this.buttonPanel,BorderLayout.SOUTH);
    }

    @Override
    public void componentInitializer() {
        this.priorityQueue.peek().init();
        MigLayout migLayout = new MigLayout("","","");

    }
}
