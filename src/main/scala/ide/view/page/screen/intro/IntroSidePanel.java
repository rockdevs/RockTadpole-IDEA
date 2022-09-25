package az.rock.ide.view.page.screen.intro;

import az.rock.ide.engine.ApplicationProperty;
import az.rock.ide.view.ui.button.GButton;
import az.rock.ide.view.ui.button.GSimpleButton;
import az.rock.ide.view.ui.button.GUnborderButton;
import az.rock.ide.view.ui.frame.GPrimaryProcessFrame;
import az.rock.ide.view.ui.icon.enums.GIconBar;
import az.rock.ide.view.ui.panel.GSimplePanel;
import az.rock.ide.view.util.ImageProvider;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;

public class IntroSidePanel extends GSimplePanel {
    private final GPrimaryProcessFrame primaryProcessFrame;


    private final GSimplePanel iconPanel = new IconPanel();
    private final GSimplePanel centerButtonPanel = new CenterButtonPanel();
    private final GSimplePanel bottomPanel = new BottonPanel();



    public IntroSidePanel(GPrimaryProcessFrame processFrame){
        this.primaryProcessFrame = processFrame;
        this.setLayout(new BorderLayout());
        this.add(this.iconPanel,BorderLayout.NORTH);
        this.add(this.centerButtonPanel,BorderLayout.CENTER);
        this.add(this.bottomPanel,BorderLayout.SOUTH);
    }
    

    @Override
    public void componentInitializer() {
        iconPanel.componentInitializer();
    }



    class IconPanel extends GSimplePanel{
        private final JLabel image = new JLabel();
        {
            try {
                this.image.setIcon(new ImageIcon(ImageProvider.getImage(GIconBar.MAIN_ICON.path(),new Dimension(50,50))));
            }catch (Exception exception){

            }
        }
        private final JLabel header = new JLabel(ApplicationProperty.NAME);
        private final JLabel version = new JLabel(ApplicationProperty.VERSION);
        private GSimplePanel textPanel = new GSimplePanel();
        {
            //JLabel Configuration
            this.header.setFont(new Font("Roboto",Font.PLAIN,18));
            this.version.setForeground(Color.gray);
        }

        {
            //TextPanel COnfiguration
            this.textPanel.setLayout(new BorderLayout());
            this.textPanel.add(this.header,BorderLayout.NORTH);
            this.textPanel.add(this.version,BorderLayout.SOUTH);
        }
        public IconPanel(){
            this.setLayout(new FlowLayout(FlowLayout.LEFT));
            this.add(this.image);
            this.add(this.textPanel);
            this.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        }
    }



    class BottonPanel extends GSimplePanel{
        private GButton settingsButton = new GSimpleButton(GIconBar.SETTINGS);

        public BottonPanel(){
            this.setLayout(new FlowLayout(FlowLayout.LEFT));
            this.add(this.settingsButton);
        }
    }


    class CenterButtonPanel extends GSimplePanel{
        private final MigLayout migLayout  = new MigLayout("fillx");
        private GButton projectButton = new GUnborderButton("Projects");

        public CenterButtonPanel(){
            this.setLayout(this.migLayout);
            this.add(projectButton,"grow");
        }
    }
}
