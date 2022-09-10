package az.rock.ide.view.page.screen.main.side.west;

import az.rock.ide.view.ui.icon.enums.GSettingsIcon;
import az.rock.ide.view.util.ImageProvider;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;

public class SlideProjectGTree extends JTree {

    public static TreeModel getSettingTreeModel(){
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Project Navigator");
        DefaultMutableTreeNode      parent;

        parent = new DefaultMutableTreeNode("External Libraries");
        root.add(parent);
        parent.add(new DefaultMutableTreeNode("JDK"));

        parent = new DefaultMutableTreeNode("Scratches and Consoles");
        root.add(parent);
        parent.add(new DefaultMutableTreeNode("Extensions"));
        parent.add(new DefaultMutableTreeNode("Scratches"));
        return new DefaultTreeModel(root);
    }

    public SlideProjectGTree(){
        super(getSettingTreeModel());
        DefaultTreeCellRenderer renderer = (DefaultTreeCellRenderer) this.getCellRenderer();
        renderer.setLeafIcon(ImageProvider.getIcon(GSettingsIcon.LEFT.path()));
    }
}
