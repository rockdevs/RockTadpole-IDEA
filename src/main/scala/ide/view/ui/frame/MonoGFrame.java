package az.rock.ide.view.ui.frame;

import java.awt.*;
public abstract class MonoGFrame extends GPrimaryProcessFrame {

    {
        super.setSize(new Dimension(700,600));
        super.setLayout(new BorderLayout());
        super.setLocationRelativeTo(null);
    }

    public MonoGFrame(String name){
        super(name);
    }

}