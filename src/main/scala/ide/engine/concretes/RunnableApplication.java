package az.rock.ide.engine.concretes;

import az.rock.ide.engine.abstracts.RockApplication;
import az.rock.ide.engine.project.ProjectModel;
import az.rock.ide.engine.setting.SettingsProvider;
import az.rock.ide.engine.theme.ViewProvider;
import az.rock.ide.view.page.screen.intro.IntroGScreenPrimary;
import az.rock.ide.view.ui.frame.Compiler;
import az.rock.ide.view.page.screen.SplashGScreen;
import az.rock.ide.view.page.screen.main.MainGScreenPrimary;
import az.rock.ide.view.ui.factory.abstracts.AbstractScreenFactory;
import az.rock.ide.view.ui.factory.concretes.ScreenFactory;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Stream;

public class RunnableApplication implements RockApplication {
    private static final SettingsProvider settingsProvider = new SettingsProvider();
    private static final TaskProvider taskProvider = new TaskProvider();

    static {
        ViewProvider.postViewDefaultInitializer();
    }
    
    private final AbstractScreenFactory screenFactory = new ScreenFactory();
    
    private final ExecutorService executorService =  Executors.newFixedThreadPool(5);
    
    private final List<Callable<Boolean>> callables = new ArrayList<>();

    private final SplashGScreen splashGScreen = this.screenFactory.factorySplashGScreen();
    private final IntroGScreenPrimary introGScreen = new IntroGScreenPrimary("Open Project");
    //private final MainGScreenPrimary introGScreen = new MainGScreenPrimary(new ProjectModel());
    private final Callable<Boolean> mainCallable = ()->{
        Thread.sleep(300);
        Stream.of(introGScreen).forEach(Compiler::compile);
        return true;
    };

    {
        callables.add(mainCallable);
    }

    private final Runnable runnableSplash = this.splashGScreen::compile;
    private final Runnable runnableIntroScreen = this.introGScreen::compile;


    @Override
    public void run(String... args) {
        try {
            Thread splashTread = new Thread(runnableIntroScreen);
            splashTread.start();
        } catch (Exception  e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(new JFrame("Error"),"Init Application  Exception");
            System.exit(0);
        }
    }


}
