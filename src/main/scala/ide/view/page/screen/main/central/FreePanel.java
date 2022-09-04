package az.rock.ide.view.page.screen.main.central;

import az.rock.ide.view.page.lib.panel.GPanel;

import javax.swing.*;
import java.awt.*;

public class FreePanel extends GPanel {
    private final JLabel label = new JLabel();
    private final String blueColor = "#277BC0";
    private final String context = "<html>"
                    .concat("<span>Search Everywhere</span> &nbsp &nbsp<span style=\"color:"+blueColor+";font-size:15px\">Double Shift</span> <br>")
                    .concat("<span>Go to File</span>&nbsp &nbsp<span style=\"color:"+blueColor+";font-size:15px\">Ctrl + Shift + N</span> <br>")
                    .concat("<span>Recent Files</span>&nbsp &nbsp<span style=\"color:"+blueColor+";font-size:15px\">Ctrl + E </span><br>")
                    .concat("<span>Navigation Bar</span>&nbsp &nbsp<span style=\"color:"+blueColor+";font-size:15px\">Alt + Home </span> <br>")
                    .concat("</html>");
    {
        this.label.setText(context);
        this.label.setHorizontalAlignment(JLabel.CENTER);
        this.label.setForeground(Color.lightGray);
        this.label.setFont(new Font("Roboto", Font.PLAIN, 22));
    }
    public FreePanel(){
        super();
        this.setLayout(new GridBagLayout());
        this.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        this.add(Box.createHorizontalGlue());
        this.add(this.label);
        this.add(Box.createHorizontalGlue());
    }


    @Override
    public void postConst() {

    }

    @Override
    public void componentInitializer() {

    }
}
