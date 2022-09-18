package az.rock.ide.common.log;

import java.awt.*;
import java.util.Date;

public class Logger {
    public static void info(AWTEvent event){
        System.out.println(ConsoleColor.RESET.getColor() +
                ConsoleColor.GREEN.getColor() + "[LOG INFO  " + new Date().toString() + " ] : -> ".concat(
                        ConsoleColor.YELLOW.getColor() + event.getID() + " : " +  event.toString() + " - Class : " + event.getClass()
                )
        );
    }

    public static void error(AWTError event){

    }

    public static void exception(AWTException event){

    }

    public static void spec(String specialText){
        System.out.println(ConsoleColor.RESET.getColor() +
                        ConsoleColor.CYAN.getColor() + "[LOG SPEC  " + new Date().toString() + " ] : -> ".concat(
                        ConsoleColor.WHITE.getColor() + specialText
                )
        );
    }

}
