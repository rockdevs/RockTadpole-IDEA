package az.rock.ide.view.page.screen.intro;

import az.rock.ide.engine.ApplicationProperty;
import az.rock.ide.view.ui.StaticUIFrame;
import az.rock.ide.view.ui.button.GButton;
import az.rock.ide.view.ui.button.GSimpleButton;
import az.rock.ide.view.ui.button.GUnborderPanelButton;
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

        this.setBackground(StaticUIFrame.getPanelBakground().darker());
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
            this.textPanel.setBackground(StaticUIFrame.getPanelBakground().darker());
            this.textPanel.setLayout(new BorderLayout());
            this.textPanel.add(this.header,BorderLayout.NORTH);
            this.textPanel.add(this.version,BorderLayout.SOUTH);
        }
        public IconPanel(){
            this.setLayout(new FlowLayout(FlowLayout.LEFT));
            this.add(this.image);
            this.add(this.textPanel);
            this.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
            this.setBackground(StaticUIFrame.getPanelBakground().darker());
        }
    }



    class BottonPanel extends GSimplePanel{
        private GButton settingsButton = new GSimpleButton(GIconBar.SETTINGS);
        private final JLabel rockDevs_company = new JLabel("Copyright © 2021-2022 Rock s.r.o.  ");
        {
            settingsButton.setBackground(StaticUIFrame.getPanelBakground().darker());
            rockDevs_company.setFont(new Font("Helvetica", Font.PLAIN, 10));
            rockDevs_company.setForeground(Color.lightGray);
        }
        public BottonPanel(){
            this.setLayout(new BorderLayout());
            this.add(this.settingsButton,BorderLayout.WEST);
            this.add(rockDevs_company,BorderLayout.EAST);

            this.setBackground(StaticUIFrame.getPanelBakground().darker());
            this.setBorder(BorderFactory.createEmptyBorder(0,5,0,0));
        }
    }


    class CenterButtonPanel extends GSimplePanel{
        private final MigLayout migLayout  = new MigLayout("fillx");
        private GButton projectButton = new GUnborderPanelButton("Projects");
        private GButton learnButton = new GUnborderPanelButton("Learn RockTadpole");
        private GButton donateButton = new GUnborderPanelButton("Donate");

        public CenterButtonPanel(){
            this.setLayout(this.migLayout);
            this.add(projectButton,"grow,span");
            this.add(learnButton,"grow,span");
            this.add(this.donateButton,"grow, span");
            this.setBackground(StaticUIFrame.getPanelBakground().darker());
        }
    }
}
