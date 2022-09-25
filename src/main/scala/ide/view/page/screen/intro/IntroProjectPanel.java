package az.rock.ide.view.page.screen.intro;

import az.rock.ide.view.ui.button.GButton;
import az.rock.ide.view.ui.button.GSimpleButton;
import az.rock.ide.view.ui.button.GSquareButton;
import az.rock.ide.view.ui.icon.enums.GIconBar;
import az.rock.ide.view.ui.panel.GSimplePanel;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;

public class IntroProjectPanel extends GSimplePanel{
    private final GSimplePanel topPanel = new TopPanel();
    private final GSimplePanel centerPanel = new IntroFreePanel();

    public IntroProjectPanel(){
        this.setLayout(new BorderLayout());
        this.add(this.topPanel,BorderLayout.NORTH);
        this.add(this.centerPanel,BorderLayout.CENTER);
    }

    @Override
    public void componentInitializer() {
        this.topPanel.init();
    }

    @Override
    public void postConst() {

    }

    class TopPanel extends GSimplePanel{

        private final GSimplePanel buttonPanel = new GSimplePanel();
        private final GButton openProject = new GSimpleButton("Open Project", GIconBar.FOLDER);
        private final GButton newProject = new GSimpleButton("New Project",GIconBar.FOLDER);
        private final GButton getRepository = new GSimpleButton("Git Repository",GIconBar.GIT);

        {
            this.buttonPanel.setLayout(new GridBagLayout());
            this.buttonPanel.add(this.newProject);
            this.buttonPanel.add(this.openProject);
            this.buttonPanel.add(this.getRepository);
        }

        private final GSimplePanel searchPanel = new GSimplePanel();
        private final JTextField searchContext  = new JTextField();
        private final GButton searchButton = new GSimpleButton(" Search ",GIconBar.SEARCH);
        {
            this.searchPanel.setLayout(new BorderLayout());
            this.searchPanel.add(this.searchContext,BorderLayout.CENTER);
            this.searchPanel.add(this.searchButton,BorderLayout.WEST);
            this.searchPanel.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));
        }

        @Override
        public void componentInitializer() {
            this.setLayout(new BorderLayout());
            this.add(this.searchPanel,BorderLayout.CENTER);
            this.add(this.buttonPanel,BorderLayout.EAST);
        }
    }

    class IntroFreePanel extends GSimplePanel{
        private final JLabel context = new JLabel("There is't any Project here",SwingConstants.CENTER);
        {
            this.context.setForeground(Color.decode("#3AB0FF"));
            this.context.setFont(new Font("Roboto-light", Font.PLAIN, 20));
        }


        public IntroFreePanel(){
            this.setLayout(new BorderLayout());
            this.add(this.context,BorderLayout.CENTER);
        }


        @Override
        public void componentInitializer() {

        }
    }


}
