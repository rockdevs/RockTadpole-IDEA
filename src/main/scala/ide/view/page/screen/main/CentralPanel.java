package az.rock.ide.view.page.screen.main;

import az.rock.ide.view.page.lib.panel.GPanel;

public final class CentralPanel extends GPanel {
    private  GPanel panel =new FreePanel();

    public CentralPanel(){
        super();
        this.add(this.panel);
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
    public void initializer() {
        this.panel.init();
    }
}
