package az.rock.ide.view.state.model;

import az.rock.ide.view.state.State;
import az.rock.ide.view.state.Stateful;

public class MainState implements State {
    public static Stateful<MainState> factory(){
        return new Stateful<>(new MainState());
    }

}
