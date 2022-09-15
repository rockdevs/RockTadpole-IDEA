package az.rock.ide.view.page.screen.toolBar.file.newFile;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;

public class MainNewProjectPanel extends InnerQueuePanel{

    private final MigLayout migLayout = new MigLayout("","[]10[]","[]10[]");

    private final JLabel projectNameLabel = new JLabel("Project Name");
    private final JTextField projectNameField = new JTextField();

    private final JLabel locationLabel = new JLabel("Location");
    private final JTextField locationField = new JTextField();

    private final JLabel sdkLabel = new JLabel("SDK : ");
    private final JTextField sdkField = new JTextField();

    private final JLabel gitLabel = new JLabel("Git repository?");
    private final JCheckBox gitField = new JCheckBox();

    private final JLabel sampleLabel = new JLabel("Add sample code?");
    private final JCheckBox sampleField = new JCheckBox();

    private final JLabel buildLabel = new JLabel("Build Tool");
    private final JTextField buildField = new JTextField();

    private final JLabel langLabel = new JLabel("Language");
    private final JTextField langField = new JTextField();

    {
        this.setLayout(this.migLayout);
        this.add(this.projectNameLabel);
        this.add(this.projectNameField,"wrap");

        this.add(this.locationLabel);
        this.add(this.locationField,"wrap");

        this.add(this.sdkLabel);
        this.add(this.sdkField,"wrap");

        this.add(this.gitLabel);
        this.add(this.gitField);

        this.add(this.sampleLabel);
        this.add(this.sampleField,"wrap");

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
