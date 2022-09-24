package az.rock.ide.engine.terminal.concretes.executor;

import az.rock.ide.common.log.Logger;
import az.rock.ide.engine.terminal.abstracts.ApplicationExecutor;
import az.rock.ide.engine.terminal.abstracts.CommandService;
import az.rock.ide.engine.terminal.abstracts.RockProcessBuilder;
import az.rock.ide.engine.terminal.concretes.model.JavaExecuteModel;

import java.lang.reflect.Constructor;

public class JavaApplicationExecutor implements ApplicationExecutor {
    private static CommandService COMMAND_SERVICE;
    static {
        try {
            Constructor constructor = RockProcessBuilder.getCommandService().getDeclaredConstructor();
            COMMAND_SERVICE = (CommandService) constructor.newInstance();
        }catch (Exception exception){
            Logger.throwSpec(exception.getMessage());
        }
    }

    private JavaExecuteModel javaExecuteModel;


    public JavaApplicationExecutor(JavaExecuteModel javaExecuteModel){
        super();
        this.javaExecuteModel = javaExecuteModel;
    }


    @Override
    public void execute() {

    }
}
