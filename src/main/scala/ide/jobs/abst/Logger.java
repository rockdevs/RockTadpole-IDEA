package az.rock.ide.jobs.abst;

import java.awt.*;
import java.time.LocalDate;
import java.util.Date;

public class Logger {
    public static void info(AWTEvent event){
        System.out.println(ConsoleColor.RESET.getColor() +
                ConsoleColor.GREEN.getColor() + "[LOG INFO  " + new Date().toString() + "] : -> ".concat(
                        ConsoleColor.CYAN.getColor() + event.getID() + " : " +  event.toString() + " "
                ).concat(
                         ConsoleColor.WHITE.getColor() + event.getSource()+ " " +  event.paramString()
                )
        );
    }

    public static void error(AWTError event){

    }

    public static void exception(AWTException event){

    }

}
