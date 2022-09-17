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
    private Icon accourdionIconCollapse = ImageProvider.getIcon(GIconBar.COLLAPSE.path());
    private Icon accourdionIconExpand = ImageProvider.getIcon(GIconBar.EXPAND.path());
    private JLabel iconLabel;
    private Icon currentAccordion = this.accourdionIconCollapse;
    {
        this.iconLabel = new JLabel(this.currentAccordion);
    }

    private final JLabel headerLabel = new JLabel("");
    private final GPanel headerPanel = new GSimplePanel();
    private final GPanel headerLabelPanel = new GSimplePanel();
    private GPanel bodyPanel = new GSimplePanel();
    private JSeparator seperator = new JSeparator(JSeparator.HORIZONTAL);



    {
        this.seperator.setBackground(Color.white);
        this.setLayout(new BorderLayout());
        this.add(this.headerPanel,BorderLayout.NORTH);
        this.add(this.bodyPanel,BorderLayout.CENTER);
        this.add(this.seperator,BorderLayout.SOUTH);
    }

    {
        this.headerLabel.setFont(new Font("Dialog", Font.PLAIN, 14));
    }

    {
        this.headerPanel.setLayout(new BorderLayout());
        this.headerLabelPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        this.headerPanel.add(this.headerLabelPanel,BorderLayout.CENTER);
        this.headerPanel.add(this.seperator,BorderLayout.SOUTH);
        this.bodyPanel.setLayout(new BorderLayout());

        this.headerLabelPanel.add(this.iconLabel);
        this.headerLabelPanel.add(this.headerLabel);
        this.bodyPanel.setVisible(this.accordionState);
        this.bodyPanel.setBorder(BorderFactory.createEtchedBorder());
    }

    {
        this.headerLabel.addMouseListener(new HeaderLabelMouseAdapter(this));
    }



    public GAccordionPanel(String headerText,GPanel bodyPanel) {
        this.headerLabel.setText(headerText);
        this.bodyPanel.add(bodyPanel,BorderLayout.CENTER);

    }

    public void switchBody(){
        this.headerLabelPanel.remove(this.iconLabel);
        this.accordionState = !this.accordionState;
        this.bodyPanel.setVisible(this.accordionState);
        this.currentAccordion = this.currentAccordion == this.accourdionIconCollapse?this.accourdionIconExpand:this.accourdionIconCollapse;
        this.iconLabel.setIcon(this.currentAccordion);
        this.headerLabelPanel.add(this.iconLabel,0);
        this.seperator.setVisible(!this.accordionState);
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