package az.rock.ide.view.page.screen.main.side.west;

import az.rock.ide.view.page.lib.panel.GPanel;
import az.rock.ide.view.ui.button.GButton;
import az.rock.ide.view.ui.button.GIconButton;
import az.rock.ide.view.ui.icon.enums.GIconBar;
import az.rock.ide.view.page.screen.actions.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SlideTopPanel extends GPanel {
    private final JLabel title;
    private final GButton  closeButton = new GIconButton(GIconBar.CANCEL);
    private final GButton hideButton = new GIconButton(GIconBar.HIDE);
    private final JPanel parent;
    private final JPanel leftPanel = new JPanel();
    {
        this.leftPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        this.leftPanel.add(hideButton);
        this.leftPanel.add(closeButton);
    }

    public SlideTopPanel(JLabel panelName,JPanel parent){
        super();
        this.parent = parent;
        this.title = panelName;
        this.setLayout(new BorderLayout());
        this.add(this.title,BorderLayout.WEST);
        this.add(this.leftPanel,BorderLayout.EAST);

    }

    @Override
    public void componentInitializer() {
        closeButton.addActionListener(new ClosePanelActionListener(this.parent));
    }

    @Override
    public void postConst() {

    }
    
    public void addCLoseActionListener(ActionListener actionListener){
        closeButton.addActionListener(actionListener);
    }
    
    public void addHideActionListener(ActionListener actionListener){
        this.hideButton.addActionListener(actionListener);
    }


}
