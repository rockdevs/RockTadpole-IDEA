package az.rock.ide.view.ui.textField;

import az.rock.ide.view.ui.panel.GSimplePanel;
import lombok.Data;
import lombok.Getter;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;

@Data
@Getter
public class GLabelTextFiled extends GSimplePanel {
    private final JLabel text = new JLabel();
    private final JTextField textField = new JTextField();
    private final MigLayout migLayout = new MigLayout("fillx","","");

    {
        this.setLayout(migLayout);
        this.add(this.text,"cell 0 0");
        this.add(this.textField,"cell 0 1, span 2, grow");
    }

    public GLabelTextFiled(String text){
        this.text.setText(text);
    }

    public String getContext(){
        return this.textField.getText();
    }

    @Override
    public void postConst() {

    }

    @Override
    public void componentInitializer() {

    }
}


