package az.rock.ide.view.page.screen.intro;

import az.rock.ide.engine.ApplicationProperty;
import az.rock.ide.view.ui.frame.GPrimaryProcessFrame;
import az.rock.ide.view.ui.panel.GSimplePanel;

public class IntroSidePanel extends GSimplePanel {
    private final GPrimaryProcessFrame primaryProcessFrame;


    private GSimplePanel iconPanel = new GSimplePanel();




    public IntroSidePanel(GPrimaryProcessFrame processFrame){
        this.primaryProcessFrame = processFrame;
    }
    
    
    @Override
    public void postConst() {
    }

    @Override
    public void componentInitializer() {
        
    }



    class IconPanel extends GSimplePanel{
        private final String header = ApplicationProperty.NAME;
        private final String version = ApplicationProperty.VERSION;

        public IconPanel(){
            
        }
        
        @Override
        public void componentInitializer() {

        }
    }


}
