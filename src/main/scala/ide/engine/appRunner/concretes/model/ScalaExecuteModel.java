package az.rock.ide.engine.appRunner.concretes.model;

import az.rock.ide.engine.appRunner.abstracts.ExecuteModel;

import java.util.Map;

public class ScalaExecuteModel extends ExecuteModel {
    public ScalaExecuteModel(String version,String classPath){
        super(version, classPath);
        super.setLang("scala");
        super.setCompiler("scalac");
    }

    public ScalaExecuteModel(String version, String classPath, Map<String,String> enviorimentVariables){
        this(version, classPath);
        super.setEnviorimentVariables(enviorimentVariables);
    }
    
}
