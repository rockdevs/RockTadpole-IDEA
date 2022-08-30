package az.rock.ide.view.ui.factory.concretes;

import az.rock.ide.view.page.screen.SplashGScreen;
import az.rock.ide.view.ui.factory.abstracts.AbstractScreenFactory;
import az.rock.ide.view.page.screen.main.*;
public class ScreenFactory extends AbstractScreenFactory {


    @Override
    public MainGScreen factoryMainGScreen() {
        return new MainGScreen("Rock IDEA");
    }


    @Override
    public SplashGScreen factorySplashGScreen() {
        return new SplashGScreen();
    }


}
