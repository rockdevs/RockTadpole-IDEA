package az.rock.ide.engine.appRunner.concretes.executor;

import az.rock.ide.engine.appRunner.abstracts.ApplicationExecutor;
import az.rock.ide.engine.appRunner.concretes.model.JavaExecuteModel;

public class JavaApplicationExecutor implements ApplicationExecutor {
    private JavaExecuteModel javaExecuteModel;
    
    
    public JavaApplicationExecutor(JavaExecuteModel javaExecuteModel){
        super();
        this.javaExecuteModel = javaExecuteModel;
    }
    
    
    @Override
    public void execute() {
        
    }
}
