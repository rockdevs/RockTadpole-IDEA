package az.rock.ide.engine.appRunner;

import lombok.Getter;

@Getter
public class OSPropertyProvider {
    private static String operationSystem;

    static {
        
    }
    
    public static String getOperationSystem() {
        return operationSystem;
    }
}
