package az.rock.ide.view.page.screen.toolBar.file.newFile;


import az.rock.ide.view.page.lib.panel.GAccordionPanel;
import az.rock.ide.view.page.lib.panel.GPanel;
import az.rock.ide.view.page.lib.panel.GSimplePanel;
import az.rock.ide.view.page.screen.intro.IntroWestPanel;
import az.rock.ide.view.ui.DataObject;
import az.rock.ide.view.ui.GFileChooser;
import az.rock.ide.view.ui.GFileChooserPanel;
import az.rock.ide.view.ui.icon.enums.GIconBar;
import az.rock.ide.view.ui.textField.GLabelTextFiled;
import az.rock.ide.view.ui.frame.MonoGFrame;
import az.rock.ide.view.ui.button.*;
import az.rock.ide.view.ui.textField.GTextField;
import lombok.Data;
import lombok.Getter;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

@Data
@Getter
public class NewProjectFrame extends MonoGFrame {

    private JPanel buttonPanel  = new GSimplePanel();
    private GButton nextButton = new GSimpleButton("Next");
    private GButton previousButton = new GSimpleButton("Preview");
    private GButton cancelButton = new GSimpleButton("Cancel");

    private GPanel currentMainPanel;

    private final List<GPanel> panelList = new ArrayList<>();

    {
        this.panelList.add(new MainNewProjectPanel());
        this.panelList.add(new ArtifactPanel());
        this.currentMainPanel = this.panelList.get(0);

        this.buttonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        this.buttonPanel.add(this.cancelButton);
        this.buttonPanel.add(this.previousButton);
        this.buttonPanel.add(this.nextButton);
    }


    public NewProjectFrame(String name){
        super(name);
    }


    @Override
    public void postConst() {
        this.add(new IntroWestPanel(this),BorderLayout.WEST);
        this.add(this.getPanelList().get(0),BorderLayout.CENTER);
        this.add(this.buttonPanel,BorderLayout.SOUTH);

        this.nextButton.addActionListener(new ButtonActionListener(this,ButtonOperation.NEXT));
        this.previousButton.addActionListener(new ButtonActionListener(this,ButtonOperation.PREVIOUS));
        this.cancelButton.addActionListener(new ButtonActionListener(this,ButtonOperation.CANCEL));

    }

    @Override
    public void componentInitializer() {
        this.getPanelList().get(0).init();
    }

    public GPanel getCurrentPanel(){
        return this.getCurrentMainPanel();
    }

    public void setCurrentMainPanel(GPanel panel){
        this.currentMainPanel = panel;
    }
}

class ButtonActionListener implements ActionListener{
    private NewProjectFrame parent;
    private ButtonOperation operation;

    public ButtonActionListener(NewProjectFrame panel, ButtonOperation operation){
        this.parent = panel;
        this.operation = operation;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.operation.action(e,parent);
        this.parent.updateUI();
    }
}

enum ButtonOperation{
    NEXT{
        @Override
        public void action(ActionEvent event, NewProjectFrame parentFrame) {
            var currentPanel = parentFrame.getCurrentMainPanel();
            parentFrame.remove(currentPanel);
            var next = parentFrame.getPanelList().get(1);
            parentFrame.add(next,BorderLayout.CENTER);
            next.init();
            parentFrame.setCurrentMainPanel(next);
        }
    },CANCEL{
        @Override
        public void action(ActionEvent event, NewProjectFrame parentFrame) {
            parentFrame.dispose();
        }
    }, PREVIOUS {
        @Override
        public void action(ActionEvent event, NewProjectFrame parentFrame) {
            var currentPanel = parentFrame.getCurrentMainPanel();
            parentFrame.remove(currentPanel);
            var previous = parentFrame.getPanelList().get(0);
            parentFrame.add(previous,BorderLayout.CENTER);
            previous.init();
            parentFrame.setCurrentMainPanel(previous);
        }
    },
    CREATE{
        @Override
        public void action(ActionEvent event, NewProjectFrame parentFrame) {
            parentFrame.getPanelList().get(1).getData();
        }
    };

    public abstract void action(ActionEvent event, NewProjectFrame parentFrame);
}



class ArtifactPanel extends InnerQueuePanel{
    private GPanel panel = new GSimplePanel();
    private GPanel accordionPanel;
    private final MigLayout migLayout = new MigLayout("fillx","[]2[]","[center]10[]");

    private final GLabelTextFiled artifactId = new GLabelTextFiled("Group Id: ");
    private final GLabelTextFiled groupId = new GLabelTextFiled("Artifact Id: ");
    private final GLabelTextFiled version = new GLabelTextFiled("Version: ");

    {
        //Default values
        this.artifactId.getTextField().setText("Example");
        this.groupId.getTextField().setText("com.example.ws");
        this.version.getTextField().setText("1.0 SNAPSHOT");
    }


    {
        this.setLayout(new BorderLayout());
        this.panel.setLayout(this.migLayout);
        this.panel.add(this.artifactId,"span, grow");
        this.panel.add(this.groupId,"span, grow");
        this.panel.add(this.version,"span, grow");
        this.add(new GAccordionPanel("Artifact",this.panel),BorderLayout.CENTER);

    }

    @Override
    public DataObject getData() {
        ArtifactPanelDataObject artifactPanelDataObject = new ArtifactPanelDataObject(this.artifactId.getContext(),groupId.getContext(),version.getContext());
        System.out.println(artifactPanelDataObject.toString());
        return artifactPanelDataObject;
    }

    @Override
    public void postConst() {

    }

    @Override
    public void componentInitializer() {

        this.panel.init();
    }

    class ArtifactPanelDataObject implements DataObject {
        private String artifactId;
        private String groupId;
        private String version;

        public ArtifactPanelDataObject(String artifactId,String groupId,String version){
            this.artifactId = artifactId;
            this.version = version;
            this.groupId = groupId;
        }

        @Override
        public String toString() {
            return this.artifactId + " " + this.groupId + " " + this.version;
        }
    }
}





class MainNewProjectPanel extends InnerQueuePanel{

    private final MigLayout migLayout = new MigLayout("fillx","[]10[]","[center]10[]");

    private final JLabel projectNameLabel = new JLabel("Project Name");
    private final JTextField projectNameField = new GTextField();

    private final JLabel locationLabel = new JLabel("Location");
    private final GPanel locationField = new GFileChooserPanel(this);

    private final JLabel sdkLabel = new JLabel("SDK : ");
    private final JTextField sdkField = new GTextField();

    private final JLabel gitLabel = new JLabel("Git repository?");
    private final JCheckBox gitField = new JCheckBox();

    private final JLabel sampleLabel = new JLabel("Add sample code?");
    private final JCheckBox sampleField = new JCheckBox();

    private final JLabel buildLabel = new JLabel("Build Tool");
    private final JTextField buildField = new GTextField();

    private final JLabel langLabel = new JLabel("Language");
    private final JTextField langField = new GTextField();

    {
        //Default values
        this.projectNameField.setText("Example");


    }

    {
        this.setLayout(this.migLayout);
        this.add(this.projectNameLabel);
        this.add(this.projectNameField,"span, grow");

        this.add(this.locationLabel);
        this.add(this.locationField,"span, grow");

        this.add(this.sdkLabel);
        this.add(this.sdkField,"span, grow");

        this.add(this.gitLabel);
        this.add(this.gitField,"gap unrelated, left");

        this.add(this.sampleLabel);
        this.add(this.sampleField,"span, grow, left");

        this.add(this.buildLabel);
        this.add(this.buildField);

        this.add(this.langLabel);
        this.add(this.langField);
    }
    @Override
    public void postConst() {

    }

    @Override
    public void componentInitializer() {

    }
}


