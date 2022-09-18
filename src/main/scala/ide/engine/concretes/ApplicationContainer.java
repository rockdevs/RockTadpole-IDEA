package az.rock.ide.engine.concretes;

import az.rock.ide.common.log.Logger;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class ApplicationContainer implements ActionListener {
    private static final List<Window> FRAME_CONTAINER = new ArrayList<>();

    public  static void register(Window window){
        FRAME_CONTAINER.add(window);

    }

    public static void dispose(Window window){
        FRAME_CONTAINER.remove(window);;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Logger.info(e);
    }
}
