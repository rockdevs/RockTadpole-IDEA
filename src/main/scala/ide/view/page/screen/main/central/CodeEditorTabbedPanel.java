package az.rock.ide.view.page.screen.main.central;

import az.rock.ide.run.concretes.task.Initializer;
import az.rock.ide.view.page.lib.panel.GPanel;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CodeEditorTabbedPanel extends GPanel {
    private final JTabbedPane tabbedPane = new JTabbedPane();
    private final List<Initializer> codeEditorPanels = new ArrayList<>();

    {
        this.codeEditorPanels.add(new CodeEditorPanel());

    }

    public CodeEditorTabbedPanel(){

        this.setLayout(new BorderLayout());
        this.tabbedPane.add((Component) this.codeEditorPanels.get(0),"Main");
        this.add(tabbedPane,BorderLayout.CENTER);

    }

    @Override
    public void initializer() {

    }

    @Override
    public void postConst() {

    }
}
