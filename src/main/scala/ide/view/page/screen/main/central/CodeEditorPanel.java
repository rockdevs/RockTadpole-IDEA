package az.rock.ide.view.page.screen.main.central;

import az.rock.ide.view.page.lib.panel.GPanel;
import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rtextarea.RTextScrollPane;

import java.awt.*;


public class CodeEditorPanel extends GPanel {
    private final RSyntaxTextArea rSyntaxTextArea = new RSyntaxTextArea();

    public CodeEditorPanel(){
        super();
        this.setLayout(new BorderLayout());
        rSyntaxTextArea.setSyntaxEditingStyle("text/java");
        rSyntaxTextArea.setCodeFoldingEnabled(true);
        RTextScrollPane scrollPane = new RTextScrollPane(rSyntaxTextArea);
        this.add(scrollPane);
    }

    @Override
    public void componentInitializer() {

    }

    @Override
    public void postConst() {

    }
}
