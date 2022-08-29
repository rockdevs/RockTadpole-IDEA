package az.rock.ide.view.ui.factory.abstracts;

import az.rock.ide.common.Factory;
import az.rock.ide.view.page.component.bar.ToolGMenuBar;
import az.rock.ide.view.page.lib.bar.*;
import az.rock.ide.view.ui.bar.GMenu;
import az.rock.ide.view.ui.icon.enums.GIconBar;

import javax.swing.*;

@Factory
public interface AbstractBarFactory {

    ToolGMenuBar factoryToolGMenuBar(String context);

    GMenu factoryGMenu(String context);

    GMenuItem factoryGMenuItem(String context);

    GMenuItem factoryGMenuItem(String context, GIconBar icon);

    ListGMenuItem factoryListGMenuItem(Icon icon);

    LargeGMenuItem factoryLargeGMenuItem(Icon icon);

}
