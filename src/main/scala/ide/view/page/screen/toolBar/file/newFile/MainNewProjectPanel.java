package az.rock.ide.view.page.screen.toolBar.file.newFile;

import az.rock.ide.view.ui.textField.GTextField;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;

public class MainNewProjectPanel extends InnerQueuePanel{

    private final MigLayout migLayout = new MigLayout("","[]10[center]","[center]10[]");

    private final JLabel projectNameLabel = new JLabel("Project Name");
    private final JTextField projectNameField = new GTextField();

    private final JLabel locationLabel = new JLabel("Location");
    private final JTextField locationField = new GTextField();

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
        this.setLayout(this.migLayout);
        this.add(this.projectNameLabel);
        this.add(this.projectNameField,"span, grow");

        this.add(this.locationLabel);
        this.add(this.locationField,"span, grow");

        this.add(this.sdkLabel);
        this.add(this.sdkField,"span, grow");

        this.add(this.gitLabel);
        this.add(this.gitField);

        this.add(this.sampleLabel);
        this.add(this.sampleField,"span, grow");

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
