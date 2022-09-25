package az.rock.ide.view.ui.factory.abstracts;
import az.rock.ide.engine.project.ProjectModel;
import az.rock.ide.view.page.screen.main.*;

import az.rock.ide.view.page.screen.SplashGScreen;

public  abstract class AbstractScreenFactory {
    public abstract MainGScreenPrimary factoryMainGScreen(ProjectModel projectModel);
    public abstract SplashGScreen factorySplashGScreen();
}
