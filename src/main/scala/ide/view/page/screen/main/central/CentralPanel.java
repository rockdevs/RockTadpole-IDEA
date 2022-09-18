package az.rock.ide.view.page.screen.main.central;

import az.rock.ide.view.ui.panel.GPanel;

import java.awt.*;

public final class CentralPanel extends GPanel {
    private  GPanel panel = new FreePanel();

    public CentralPanel(){
        super();
        this.setLayout(new BorderLayout());
        this.add(this.panel,BorderLayout.CENTER);
    }


    public void setPanel(GPanel gPanel){
        this.panel = panel;
    }

    public void setPanel(){
        this.panel = new FreePanel();
    }

    @Override
    public void postConst() {

    }

    @Override
    public void componentInitializer() {
        this.panel.init();
    }
}
