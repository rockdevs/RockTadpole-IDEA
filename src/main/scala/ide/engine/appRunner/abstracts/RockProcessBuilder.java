package az.rock.ide.engine.appRunner.abstracts;

import az.rock.ide.engine.appRunner.OSPropertyProvider;
import az.rock.ide.engine.appRunner.concretes.service.MacCommandService;
import az.rock.ide.engine.appRunner.concretes.service.WindowsCommandService;

import java.util.HashMap;
import java.util.Map;

public abstract class RockProcessBuilder {
    private static final Map<String,Class<? extends CommandService>> COMMAND_SERVICE_MAP = new HashMap<>();
    {
        COMMAND_SERVICE_MAP.put("WINDOWS", WindowsCommandService.class);
        COMMAND_SERVICE_MAP.put("MAC", MacCommandService.class);
        COMMAND_SERVICE_MAP.put("LINUX", MacCommandService.class);
    }

    public static Class<? extends CommandService> getCommandService(){
        return COMMAND_SERVICE_MAP.get(OSPropertyProvider.getOperationSystem());
    }


}
