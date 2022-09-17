package az.rock.ide.view.page.lib.panel;

import az.rock.ide.view.ui.icon.enums.GIconBar;
import az.rock.ide.view.util.ImageProvider;
import lombok.Data;
import lombok.Getter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@Data
@Getter
public class GAccordionPanel extends GPanel{
    private Boolean accordionState = false;
    private Image accourdionIcon = ImageProvider.getImage(GIconBar.ANY_TYPE.path());

    private final JLabel headerLabel = new JLabel("");
    private final GPanel headerPanel = new GSimplePanel();
    private GPanel bodyPanel = new GSimplePanel();



    {
        this.setLayout(new BorderLayout());
        this.add(this.headerPanel,BorderLayout.NORTH);
        this.add(this.bodyPanel,BorderLayout.CENTER);
    }


    {
        this.headerPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        this.bodyPanel.setLayout(new BorderLayout());

        //this.headerPanel.add(this.accourdionIcon);
        this.headerPanel.add(this.headerLabel);
        this.bodyPanel.setVisible(this.accordionState);
    }

    {
        this.headerLabel.addMouseListener(new HeaderLabelMouseAdapter(this));
    }



    public GAccordionPanel(String headerText,GPanel bodyPanel) {
        this.headerLabel.setText(headerText);
        this.bodyPanel.add(bodyPanel,BorderLayout.CENTER);
    }

    public void switchBody(){
        this.accordionState = !this.accordionState;
        this.bodyPanel.setVisible(this.accordionState);
        this.updateState();
    }

    public Boolean bodyState(){
        return this.accordionState;
    }

    public void setBodyPanel(GPanel panel){
        this.bodyPanel = new GSimplePanel();
        this.bodyPanel.add(panel);
        this.updateState();
    }

    private void setAccourdionIcon(){

    }

    @Override
    public void postConst() {

    }

    @Override
    public void componentInitializer() {

    }
}


class HeaderLabelMouseAdapter extends MouseAdapter{
    private final GAccordionPanel accordionPanel;

    public HeaderLabelMouseAdapter(GAccordionPanel panel){
        this.accordionPanel = panel;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        this.accordionPanel.switchBody();
    }
}