package az.rock.ide.view.state.model;

import az.rock.ide.view.state.State;
import az.rock.ide.view.state.Stateful;

public class IntroState implements State {
    public static Stateful<IntroState> factory(){
        return new Stateful<>(new IntroState());
    }
}
