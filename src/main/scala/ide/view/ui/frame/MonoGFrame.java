package az.rock.ide.view.ui.frame;

import java.awt.*;
public abstract class MonoGFrame extends GPrimaryProcessFrame {

    {
        super.setSize(new Dimension(900,700));
        super.setLayout(new BorderLayout());
        super.setLocationRelativeTo(null);
    }

    public MonoGFrame(String name){
        super(name);
    }

}