package az.rock.ide.view.ui.factory.concretes;

import az.rock.ide.view.ui.bar.ToolGMenuBar;
import az.rock.ide.view.ui.bar.GMenu;
import az.rock.ide.view.ui.bar.GMenuItem;
import az.rock.ide.view.ui.bar.LargeGMenuItem;
import az.rock.ide.view.ui.bar.ListGMenuItem;
import az.rock.ide.view.ui.factory.abstracts.AbstractBarFactory;
import az.rock.ide.view.ui.frame.GPrimaryProcessFrame;
import az.rock.ide.view.ui.icon.enums.GIconBar;
import az.rock.ide.view.util.ImageProvider;

import javax.swing.*;
import java.util.Objects;

public class BarFactory implements AbstractBarFactory {

    @Override
    public ToolGMenuBar factoryToolGMenuBar(GPrimaryProcessFrame primaryProcessFrame,String context){
        return new ToolGMenuBar(primaryProcessFrame);
    }
    @Override
    public GMenu factoryGMenu(String context){
        return new GMenu(context);
    }
    @Override
    public GMenuItem factoryGMenuItem(String context){
        return new GMenuItem(context);
    }

    @Override
    public GMenuItem factoryGMenuItem(String context, GIconBar icon) {
        ImageIcon imageIcon = new ImageIcon(Objects.requireNonNull(ImageProvider.getImage(icon.path())));
        return  new GMenuItem(context, imageIcon);
    }

    @Override
    public ListGMenuItem factoryListGMenuItem(Icon icon){
        return new ListGMenuItem(icon);
    }
    @Override
    public LargeGMenuItem factoryLargeGMenuItem(Icon icon){
        return new LargeGMenuItem(icon);
    }
}
