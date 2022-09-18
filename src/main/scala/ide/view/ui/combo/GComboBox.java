package az.rock.ide.view.ui.combo;

import javax.swing.*;
import java.util.stream.Stream;

public class GComboBox<String> extends JComboBox<String> {
    private String[] items;

    public GComboBox(String[] items){
        this.items = items;
        Stream.of(this.items).forEach(e->{
            this.addItem(e);
        });
    }
}
