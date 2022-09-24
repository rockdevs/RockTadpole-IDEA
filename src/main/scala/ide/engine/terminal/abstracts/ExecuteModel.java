package az.rock.ide.engine.terminal.abstracts;

import az.rock.ide.engine.terminal.OSPropertyProvider;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
public abstract class ExecuteModel {
    private final String operationSystem = OSPropertyProvider.getOperationSystem();
    private String lang = "";
    private String compiler = "";
    private String version = "";
    private String classPath = "";
    private Map<String,String> enviorimentVariables;

    public ExecuteModel(String version,String classPath){
        this.version = version;
        this.classPath = classPath;
    }
    
    public ExecuteModel(String version,String classPath,Map<String,String> enviorimentVariables){
        this(version,classPath);
        this.enviorimentVariables = enviorimentVariables;
    }
}
