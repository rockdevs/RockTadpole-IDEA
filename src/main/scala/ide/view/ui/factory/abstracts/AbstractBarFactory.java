package az.rock.ide.view.ui.factory.abstracts;

import az.rock.ide.common.Factory;
import az.rock.ide.view.ui.bar.ToolGMenuBar;
import az.rock.ide.view.ui.bar.GMenu;
import az.rock.ide.view.ui.bar.GMenuItem;
import az.rock.ide.view.ui.bar.LargeGMenuItem;
import az.rock.ide.view.ui.bar.ListGMenuItem;
import az.rock.ide.view.ui.frame.GPrimaryProcessFrame;
import az.rock.ide.view.ui.icon.enums.GIconBar;

import javax.swing.*;

@Factory
public interface AbstractBarFactory {

    ToolGMenuBar factoryToolGMenuBar(GPrimaryProcessFrame primaryProcessFrame, String context);

    GMenu factoryGMenu(String context);

    GMenuItem factoryGMenuItem(String context);

    GMenuItem factoryGMenuItem(String context, GIconBar icon);

    ListGMenuItem factoryListGMenuItem(Icon icon);

    LargeGMenuItem factoryLargeGMenuItem(Icon icon);

}
