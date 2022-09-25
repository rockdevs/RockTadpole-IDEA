package az.rock.ide.engine.concretes;

import az.rock.ide.engine.abstracts.TaskService;
import az.rock.ide.engine.project.ProjectModel;
import az.rock.ide.view.page.screen.main.MainGScreenPrimary;
import az.rock.ide.view.ui.frame.Compiler;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Stream;

public class TaskManager implements TaskService {
    private final ExecutorService executorService =  Executors.newFixedThreadPool(5);
    private final List<Callable<Boolean>> callables = new ArrayList<>();

    private final ProjectModel projectModel;

    public TaskManager(ProjectModel projectModel){
        this.projectModel = projectModel;
    }


    private final Callable<Boolean> mainCallable = ()->{
        
        return true;
    };

    @Override
    public void compile() {

    }
}
