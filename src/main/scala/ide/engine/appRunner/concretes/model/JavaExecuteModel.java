package az.rock.ide.engine.appRunner.concretes.model;

import az.rock.ide.engine.appRunner.abstracts.ExecuteModel;

import java.util.Map;

public class JavaExecuteModel extends ExecuteModel {
    public JavaExecuteModel(String version,String classPath){
        super(version, classPath);
        super.setLang("java");
        super.setCompiler("javac");
    }

    public JavaExecuteModel(String version, String classPath, Map<String,String> enviorimentVariables){
        this(version, classPath);
        super.setEnviorimentVariables(enviorimentVariables);
    }
}
