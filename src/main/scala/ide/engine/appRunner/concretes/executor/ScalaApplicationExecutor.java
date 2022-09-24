package az.rock.ide.engine.appRunner.concretes.executor;

import az.rock.ide.engine.appRunner.abstracts.ApplicationExecutor;
import az.rock.ide.engine.appRunner.concretes.model.ScalaExecuteModel;

public class ScalaApplicationExecutor implements ApplicationExecutor {
    private ScalaExecuteModel scalaExecuteModel;
    
    public ScalaApplicationExecutor(ScalaExecuteModel scalaExecuteModel){
        this.scalaExecuteModel = scalaExecuteModel;
    }
    
    @Override
    public void execute() {
        
    }
}
