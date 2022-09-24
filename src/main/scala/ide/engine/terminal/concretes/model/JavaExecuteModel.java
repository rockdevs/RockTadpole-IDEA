package az.rock.ide.engine.terminal.concretes.model;

import az.rock.ide.engine.terminal.abstracts.ExecuteModel;

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
