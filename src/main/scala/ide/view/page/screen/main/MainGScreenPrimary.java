package az.rock.ide.view.page.screen.main;

import az.rock.ide.engine.project.ProjectModel;
import az.rock.ide.view.ui.frame.GMainFrame;
import az.rock.ide.view.ui.icon.enums.GIconBar;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;

public class MainGScreenPrimary extends GMainFrame {
    private final MainBlock mainBlock;
    private final ProjectModel projectModel;

    public MainGScreenPrimary(ProjectModel projectModel){
        super("RockTadpole-IDEA");
        this.projectModel = projectModel;
        mainBlock = new MainBlock();
    }

    @Override
    public void componentInitializer() {
        this.initIcon();
        this.mainBlock.init();
    }

    @Override
    public void postConst() {
        this.add(this.mainBlock);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public String getFrameName() {
        return "MainGScreenPrimary";
    }


    private void initIcon(){
        try {
            this.setIconImage(ImageIO.read(new File(GIconBar.MAIN_ICON.path())));
        }catch (IOException exception){
            JOptionPane.showMessageDialog(new JFrame("Error"), "Init Application Icon exception");
        }
    }
}
