package az.rock.ide.engine.concretes;

import az.rock.ide.engine.abstracts.RockApplication;
import az.rock.ide.view.page.lib.frame.Compiler;
import az.rock.ide.view.page.screen.SplashGScreen;
import az.rock.ide.view.page.screen.intro.IntroGScreen;
import az.rock.ide.view.page.screen.main.MainGScreen;
import az.rock.ide.view.ui.factory.abstracts.AbstractScreenFactory;
import az.rock.ide.view.ui.factory.concretes.ScreenFactory;
import com.formdev.flatlaf.FlatDarculaLaf;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Stream;

public class RunnableApplication implements RockApplication {
    static {
        try {
            UIManager.setLookAndFeel(new FlatDarculaLaf());
        } catch (UnsupportedLookAndFeelException e) {
            JOptionPane.showMessageDialog(new JFrame("Error")," There was exception while initialize windows");
        }
    }
    private final AbstractScreenFactory screenFactory = new ScreenFactory();
    private final ExecutorService executorService =  Executors.newFixedThreadPool(5);
    private final List<Callable<Boolean>> callables = new ArrayList<>();

    private final SplashGScreen splashGScreen = this.screenFactory.factorySplashGScreen();
    private final IntroGScreen introGScreen = new IntroGScreen("Open Project");

    private final Callable<Boolean> mainCallable = ()->{
        Thread.sleep(1000);
        Stream.of(new MainGScreen("RockTadpole-IDEA"))
                .forEach(Compiler::compile);
        return true;
    };
    {
        callables.add(mainCallable);
    }

    private final Runnable runnableSplash = this.splashGScreen::compile;
    private final Runnable runnableIntroScreen = this.introGScreen::compile;

    @Override
    public void run(String... args) {
//        Thread splashTread = new Thread(runnableSplash);
//        splashTread.start();
        try {
            Thread introThread = new Thread(runnableIntroScreen);
            introThread.start();
        } catch (Exception  e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(new JFrame("Error"),"Init Application  Exception");
        }
    }

//    @Override
//    public void run(String... args) {
//        Thread splashTread = new Thread(runnableSplash);
//        splashTread.start();
//        try {
//            boolean taskResult = true;
//            List<Future<Boolean>> tasks = this.executorService.invokeAll(callables);
//            for (Future<Boolean> result: tasks)
//                if (!result.get()) taskResult = false;
//            if (taskResult) splashTread.interrupt();
//        } catch (ExecutionException | InterruptedException e) {
//            e.printStackTrace();
//            JOptionPane.showMessageDialog(new JFrame("Error"),"Init Application  Exception");
//        }
//    }
}
