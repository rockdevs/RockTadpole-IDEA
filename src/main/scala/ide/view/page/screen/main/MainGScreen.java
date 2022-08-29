package az.rock.ide.view.page.screen.main;


import az.rock.ide.view.state.model.MainState;
import az.rock.ide.view.state.Stateful;
import az.rock.ide.view.ui.frame.GMainFrame;
import az.rock.ide.view.ui.icon.enums.GIconBar;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.File;
import java.io.IOException;

public class MainGScreen extends GMainFrame {
    private final static Stateful<MainState> STATE = MainState.factory();

    private final MainBlock mainBlock = new MainBlock();
    public MainGScreen(String header){
        super(header);
    }

    {
        this.add(this.mainBlock);
    }

    @Override
    public void postConst() {

    }

    @Override
    public void initializer() {
        this.initIcon();
        this.mainBlock.init();
    }

    private void initIcon(){
        try {
            this.setIconImage(ImageIO.read(new File(GIconBar.MAIN_ICON.path())));
        } catch (IOException e) {
            JOptionPane.showMessageDialog(new JFrame("Error"),"Init Application Icon exception");
        }
    }
}
