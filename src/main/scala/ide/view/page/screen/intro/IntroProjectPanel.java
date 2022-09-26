package az.rock.ide.view.page.screen.intro;

import az.rock.ide.view.ui.StaticUIFrame;
import az.rock.ide.view.ui.button.GButton;
import az.rock.ide.view.ui.button.GSimpleButton;
import az.rock.ide.view.ui.button.GUnborderSimpleButton;
import az.rock.ide.view.ui.fileChooser.GFileChooserPanel;
import az.rock.ide.view.ui.icon.enums.GIconBar;
import az.rock.ide.view.ui.panel.GSimplePanel;
import az.rock.ide.view.util.ImageProvider;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class IntroProjectPanel extends GSimplePanel{
    private final GSimplePanel topPanel = new TopPanel();
    private final GSimplePanel centerPanel = new IntroProjectLisstPanel();
    private final ProjectBottomPanel projectBottomPanel  = new ProjectBottomPanel();

    public IntroProjectPanel(){
        this.setLayout(new BorderLayout());
        this.add(this.topPanel,BorderLayout.NORTH);
        this.add(this.centerPanel,BorderLayout.CENTER);
        this.add(this.projectBottomPanel,BorderLayout.SOUTH);
        this.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
    }

    @Override
    public void componentInitializer() {
        this.topPanel.init();
        this.centerPanel.init();
        this.projectBottomPanel.init();
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

    class IntroFreeProjectListPanel extends GSimplePanel{
        private final JLabel context = new JLabel("There is't any Project here",SwingConstants.CENTER);
        {
            this.context.setForeground(Color.decode("#3AB0FF"));
            this.context.setFont(new Font("Roboto-light", Font.PLAIN, 20));
        }


        public IntroFreeProjectListPanel(){
            this.setLayout(new BorderLayout());
            this.add(this.context,BorderLayout.CENTER);
        }


        @Override
        public void componentInitializer() {

        }
    }

    class IntroProjectLisstPanel  extends GSimplePanel{
        private final List<String> projectNameList = new ArrayList<>();
        private final MigLayout migLayout = new MigLayout("fillx");
        private List<ProjectItem> projectItems  = new ArrayList<ProjectItem>();
        {
            this.projectItems.add(new ProjectItem());
            this.projectItems.add(new ProjectItem());
            this.projectItems.add(new ProjectItem());
            this.projectItems.add(new ProjectItem());
            this.projectItems.add(new ProjectItem());
        }

        public IntroProjectLisstPanel(){
            this.setLayout(this.migLayout);
        }

        @Override
        public void componentInitializer() {
            this.projectItems.stream().forEach(e->this.add(e,"grow, span"));
        }
    }


    class ProjectItem extends GSimplePanel {
        private final File file = null;
        private final JLabel directoryLabel = new JLabel("C/User/Workspace/");
        {
            this.directoryLabel.setFont(new Font("Helvetica",Font.PLAIN,10));
            this.directoryLabel.setForeground(Color.lightGray);
        }
        private final FlowLayout leftFlowlayout = new FlowLayout(FlowLayout.LEFT);
        private final FlowLayout rightFlowlayout = new FlowLayout(FlowLayout.RIGHT);

        private final GSimplePanel leftPanel = new GSimplePanel();
        private final JLabel icon = new JLabel();
        private final GButton nameButton  = new  GUnborderSimpleButton("Project Name");
        {
            this.leftPanel.setLayout(this.leftFlowlayout);
            this.leftPanel.add(this.icon);
            this.leftPanel.add(this.nameButton);
            this.nameButton.setFont(new Font("Helvetica",Font.TRUETYPE_FONT,17));
            this.leftPanel.setBorder(BorderFactory.createEmptyBorder(5,10,5,5));
        }


        private final GSimplePanel rightPanel = new GSimplePanel();
        private final GButton cancelButton = new GSimpleButton(GIconBar.CANCEL);
        {
            this.rightPanel.setLayout(this.rightFlowlayout);
            this.rightPanel.add(this.directoryLabel);
            this.rightPanel.add(this.cancelButton);
        }


        {
            try {
                ImageIcon imageIcon = new ImageIcon(ImageProvider.getImage(GIconBar.FOLDER.path(),new Dimension(20,20)));
                this.icon.setIcon(imageIcon);
            }catch (Exception exception){}

        }

        public ProjectItem(){
            this.setLayout(new BorderLayout());
            this.add(this.rightPanel,BorderLayout.EAST);
            this.add(this.leftPanel,BorderLayout.WEST);
            this.rightPanel.setBackground(this.nameButton.getBackground());
            this.leftPanel.setBackground(this.nameButton.getBackground());
            this.setBackground(this.nameButton.getBackground());
        }
    }

    class ProjectBottomPanel extends GSimplePanel{
        private final GFileChooserPanel changeWorkSpace = new GFileChooserPanel(this);
        private final GButton refreshWorkSpaceButton = new GSimpleButton(GIconBar.RESTART);

        {
            changeWorkSpace.setButtonText("Change Workspace");
        }

        public ProjectBottomPanel(){
            this.setLayout(new BorderLayout());
            this.add(this.refreshWorkSpaceButton,BorderLayout.WEST);
            this.add(this.changeWorkSpace,BorderLayout.CENTER);
        }
    }

}
