package az.rock.ide.view.page.screen.toolBar.file.newFile;


import az.rock.ide.butterfly.abst.AbstractNewProjectViewToModelButterfly;
import az.rock.ide.butterfly.conc.NewProjectViewToModelButterfly;
import az.rock.ide.view.ui.panel.GAccordionPanel;
import az.rock.ide.view.ui.panel.GPanel;
import az.rock.ide.view.ui.panel.GSimplePanel;
import az.rock.ide.view.page.screen.intro.IntroWestPanel;
import az.rock.ide.butterfly.common.DataObject;
import az.rock.ide.view.ui.combo.GComboBox;
import az.rock.ide.view.ui.fileChooser.GFileChooserPanel;
import az.rock.ide.view.ui.panel.ValidableInnerGPanel;
import az.rock.ide.view.ui.textField.GLabelTextFiled;
import az.rock.ide.view.ui.frame.MonoGFrame;
import az.rock.ide.view.ui.button.*;
import az.rock.ide.view.ui.textField.GTextField;
import lombok.Data;
import lombok.Getter;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

@Data
@Getter
public class NewProjectFrame extends MonoGFrame  {

    private final AbstractNewProjectViewToModelButterfly newProjectViewToModelButterfly = new NewProjectViewToModelButterfly();

    private JPanel buttonPanel  = new GSimplePanel();
    private GButton nextButton = new GSimpleButton("Next");
    private GButton previousButton = new GSimpleButton("Preview");
    private GButton cancelButton = new GSimpleButton("Cancel");
    private GButton createButton = new GSimpleButton("Create");

    private GPanel currentMainPanel;

    private final List<GPanel> panelList = new ArrayList<>();

    {
        this.panelList.add(new PrimaryInnerPanel());
        this.panelList.add(new SecondaryInnerPanel());
        this.currentMainPanel = this.panelList.get(0);

        this.buttonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        this.buttonPanel.add(this.cancelButton);
        this.buttonPanel.add(this.previousButton);
        this.buttonPanel.add(this.nextButton);
    }


    public NewProjectFrame(String name){
        super(name);
    }


    public void switchNextStepButton(JPanel panel){
        if(currentMainPanel == this.panelList.get(1)){
            this.buttonPanel.remove(this.nextButton);
            this.buttonPanel.add(this.createButton);
        }else if(currentMainPanel == this.panelList.get(0)){
            this.buttonPanel.remove(this.createButton);
            this.buttonPanel.add(this.nextButton);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void postConst() {
        this.add(new IntroWestPanel(this),BorderLayout.WEST);
        this.add(this.getPanelList().get(0),BorderLayout.CENTER);
        this.add(this.buttonPanel,BorderLayout.SOUTH);

        ButtonActionListener nextButtonActionListener = new ButtonActionListener(this,ButtonOperation.NEXT);
        ButtonActionListener createButtonActionListener = new ButtonActionListener(this,ButtonOperation.CREATE);
        this.nextButton.addActionListener(nextButtonActionListener);
        this.createButton.addActionListener(createButtonActionListener);
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
        this.switchNextStepButton(panel);
    }
}

class PrimaryInnerPanel extends ValidableInnerGPanel {

    private final MigLayout migLayout = new MigLayout("fillx","[]10[]","[center]10[]");

    private final JLabel projectNameLabel = new JLabel("Project Name");
    private final JTextField projectNameField = new GTextField();

    private final JLabel locationLabel = new JLabel("Location");
    private final GPanel locationField = new GFileChooserPanel(this);

    private final JLabel sdkLabel = new JLabel("SDK : ");
    private final GComboBox<String> sdkField = new GComboBox<>(new String[]{"OpenJDK 17","Amazon Corrento 11"});

    private final JLabel gitLabel = new JLabel("Git repository?");
    private final JCheckBox gitField = new JCheckBox();

    private final JLabel sampleLabel = new JLabel("Add sample code?");
    private final JCheckBox sampleField = new JCheckBox();

    private final JLabel buildLabel = new JLabel("Build Tool");
    private final GComboBox<String> buildField = new GComboBox<>(new String[]{"Maven","Gradle"});

    private final JLabel langLabel = new JLabel("Language");
    private final GComboBox<String> langField = new GComboBox<>(new String[]{"Java","Scala","Go"});

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

    @Override
    public boolean valid() {
        return true;
    }
}

class SecondaryInnerPanel extends ValidableInnerGPanel {
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

    @Override
    public boolean valid() {
        return true;
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
            parentFrame.getNewProjectViewToModelButterfly().live(parentFrame.getPanelList().get(1).getData().toString());
        }
    };

    public abstract void action(ActionEvent event, NewProjectFrame parentFrame);
}

class ValidatorService{
    public static boolean validationInnerPanels(List<ValidableInnerGPanel> validableInnerGPanels){
        return validableInnerGPanels.stream().allMatch(e->e.valid());
    }
}