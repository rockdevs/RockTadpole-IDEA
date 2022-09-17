package az.rock.ide.view.page.component.bar;

import az.rock.ide.view.page.lib.bar.GMenuItem;
import az.rock.ide.view.page.screen.intro.IntroGScreen;
import az.rock.ide.view.page.screen.toolBar.file.newFile.NewProjectFrame;
import az.rock.ide.view.ui.bar.GMenu;
import az.rock.ide.view.ui.bar.GMenuBar;
import az.rock.ide.view.ui.factory.abstracts.AbstractBarFactory;
import az.rock.ide.view.ui.factory.concretes.BarFactory;
import az.rock.ide.view.ui.icon.enums.GIconBar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.stream.Stream;

public class ToolGMenuBar extends GMenuBar {
    private final AbstractBarFactory barFactory = new BarFactory();

    //BasMenuBar
    private final GMenu fileMenu = barFactory.factoryGMenu("File");
    private final GMenu editMenu = barFactory.factoryGMenu("Edit");
    private final GMenu viewMenu = barFactory.factoryGMenu("View");
    private final GMenu navigateMenu = barFactory.factoryGMenu("Navigate");
    private final GMenu codeMenu = barFactory.factoryGMenu("Code");
    private final GMenu refactorMenu = barFactory.factoryGMenu("Refactor");
    private final GMenu buildMenu = barFactory.factoryGMenu("Build");
    private final GMenu runMenu = barFactory.factoryGMenu("Run");
    private final GMenu toolsMenu = barFactory.factoryGMenu("Tools");
    private final GMenu gitMenu = barFactory.factoryGMenu("Git");
    private final GMenu windowMenu = barFactory.factoryGMenu("Window");
    private final GMenu helpMenu = barFactory.factoryGMenu("Help");


    //File Menu
    private final GMenuItem newItem = this.barFactory.factoryGMenuItem("New", GIconBar.ANY_TYPE);
    private final GMenuItem openItem = this.barFactory.factoryGMenuItem("Open", GIconBar.FOLDER);
    private final GMenuItem openRecentItem = this.barFactory.factoryGMenuItem("Open Recent");
    private final GMenuItem closeProjectItem = this.barFactory.factoryGMenuItem("Close Project");
    private final GMenuItem settingsItem = this.barFactory.factoryGMenuItem("Settings", GIconBar.SETTINGS);
    private final GMenuItem projectStructureItem = this.barFactory.factoryGMenuItem("Project Structure", GIconBar.CONFIG_FOLDER);
    private final GMenuItem filePropertiesItem = this.barFactory.factoryGMenuItem("File Properties");
    private final GMenuItem saveAllItem = this.barFactory.factoryGMenuItem("Save All", GIconBar.SAVE);
    private final GMenuItem reloadItem = this.barFactory.factoryGMenuItem("Reload", GIconBar.FORCE_REFRESH);
    private final GMenuItem repairIde = this.barFactory.factoryGMenuItem("Repair IDE");
    private final GMenuItem exportItem = this.barFactory.factoryGMenuItem("Export");
    private final GMenuItem printItem = this.barFactory.factoryGMenuItem("Print");
    private final GMenuItem powerItem = this.barFactory.factoryGMenuItem("Power Save Mode");
    private final GMenuItem exitItem = this.barFactory.factoryGMenuItem("Exit");


    //Edit Menu
    private final GMenuItem undoItem = this.barFactory.factoryGMenuItem("Undo", GIconBar.UNDO);
    private final GMenuItem redoItem = this.barFactory.factoryGMenuItem("Redo", GIconBar.REDO);
    private final GMenuItem cutItem = this.barFactory.factoryGMenuItem("Cut", GIconBar.CUT);
    private final GMenuItem copyItem = this.barFactory.factoryGMenuItem("Copy", GIconBar.COPY);
    private final GMenuItem copyRefItem = this.barFactory.factoryGMenuItem("Copy Path/Reference ");
    private final GMenuItem deleteItem = this.barFactory.factoryGMenuItem("Select All");
    private final GMenuItem pasteItem = this.barFactory.factoryGMenuItem("Edit as Table");
    private final GMenuItem findItem = this.barFactory.factoryGMenuItem("Bookmarks");

    //View Menu
    private final GMenuItem compareItem = this.barFactory.factoryGMenuItem("Compare With...",GIconBar.COMPARE_WITH);

    {
        Stream.of(fileMenu,editMenu,viewMenu,navigateMenu,codeMenu,refactorMenu,
                        buildMenu,runMenu,toolsMenu,gitMenu,windowMenu,helpMenu)
                .forEach(this::add);

        Stream.of(newItem,openItem,openRecentItem,closeProjectItem,settingsItem,
                        projectStructureItem,filePropertiesItem, saveAllItem,
                        reloadItem,repairIde,exportItem,printItem,powerItem,exitItem)
                .forEach(this.fileMenu::add);

        Stream.of(undoItem,redoItem,cutItem,copyItem,copyRefItem,deleteItem,pasteItem,findItem)
                .forEach(this.editMenu::add);

        Stream.of(compareItem)
                .forEach(this.viewMenu::add);
    }

    @Override
    public void postConst() {
        this.openItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new IntroGScreen("Open Project").compile();
            }
        });

        this.newItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new NewProjectFrame("New Project").compile();
            }
        });
    }

    @Override
    public void componentInitializer() {

    }
}
