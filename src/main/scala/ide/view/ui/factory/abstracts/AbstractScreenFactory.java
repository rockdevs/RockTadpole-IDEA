package az.rock.ide.view.ui.factory.abstracts;

import az.rock.ide.view.page.screen.main.MainGScreen;
import az.rock.ide.view.page.screen.SplashGScreen;

public  abstract class AbstractScreenFactory {
    public abstract MainGScreen factoryMainGScreen();
    public abstract SplashGScreen factorySplashGScreen();
}
