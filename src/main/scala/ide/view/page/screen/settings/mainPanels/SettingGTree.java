package az.rock.ide.view.page.screen.settings.mainPanels;

import az.rock.ide.view.ui.icon.enums.GIconBar;
import az.rock.ide.view.ui.icon.enums.GSettingsIcon;
import az.rock.ide.view.util.ImageProvider;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;

public class SettingGTree extends JTree {


    public static TreeModel getSettingTreeModel(){
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Settings");
        DefaultMutableTreeNode      parent;

        parent = new DefaultMutableTreeNode("Editor");
        root.add(parent);
        parent.add(new DefaultMutableTreeNode("Font"));
        parent.add(new DefaultMutableTreeNode("Format"));
        parent.add(new DefaultMutableTreeNode("Language"));
        parent.add(new DefaultMutableTreeNode("Syntax"));

        parent = new DefaultMutableTreeNode("Theme");
        root.add(parent);
        parent.add(new DefaultMutableTreeNode("Change"));
        parent.add(new DefaultMutableTreeNode("Upload"));
        parent.add(new DefaultMutableTreeNode("Edit"));
        parent.add(new DefaultMutableTreeNode("RockMarketPlace"));

        parent = new DefaultMutableTreeNode("Project Structure");
        root.add(parent);
        parent.add(new DefaultMutableTreeNode("hot dogs"));
        parent.add(new DefaultMutableTreeNode("pizza"));
        parent.add(new DefaultMutableTreeNode("ravioli"));
        parent.add(new DefaultMutableTreeNode("bananas"));
        return new DefaultTreeModel(root);
    }

    public SettingGTree(){
        super(getSettingTreeModel());
        DefaultTreeCellRenderer renderer = (DefaultTreeCellRenderer) this.getCellRenderer();
        renderer.setClosedIcon(ImageProvider.getIcon(GSettingsIcon.RIGHT.path()));
        renderer.setOpenIcon(ImageProvider.getIcon(GSettingsIcon.LEFT.path()));
        renderer.setLeafIcon(ImageProvider.getIcon(GSettingsIcon.SETTINGS.path()));
    }


}
