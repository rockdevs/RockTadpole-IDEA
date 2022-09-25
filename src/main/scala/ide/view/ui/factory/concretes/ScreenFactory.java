package az.rock.ide.view.ui.factory.concretes;

import az.rock.ide.engine.project.ProjectModel;
import az.rock.ide.view.page.screen.SplashGScreen;
import az.rock.ide.view.ui.factory.abstracts.AbstractScreenFactory;
import az.rock.ide.view.page.screen.main.*;
public class ScreenFactory extends AbstractScreenFactory {


    @Override
    public MainGScreenPrimary factoryMainGScreen(ProjectModel projectModel) {
        return new MainGScreenPrimary(projectModel);
    }


    @Override
    public SplashGScreen factorySplashGScreen() {
        return new SplashGScreen();
    }


}
