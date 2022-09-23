package az.rock.ide.view.page.screen.main.central;

import az.rock.ide.engine.task.GComponentInitializer;
import az.rock.ide.view.ui.panel.GPanel;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class CodeEditorTabbedPanel extends GPanel {
    private final JTabbedPane tabbedPane = new JTabbedPane();
    private final List<GComponentInitializer> codeEditorPanels = new ArrayList<>();

    {
        this.codeEditorPanels.add(new CodeEditorPanel());

    }

    public CodeEditorTabbedPanel(){

        this.setLayout(new BorderLayout());
        this.tabbedPane.add((Component) this.codeEditorPanels.get(0),"Main");
        this.add(tabbedPane,BorderLayout.CENTER);

    }

    @Override
    public void componentInitializer() {

    }

    @Override
    public void postConst() {

    }
}
