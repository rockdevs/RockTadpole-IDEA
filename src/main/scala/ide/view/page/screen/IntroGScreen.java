package az.rock.ide.view.page.screen;

import az.rock.ide.view.state.Stateful;
import az.rock.ide.view.state.model.IntroState;
import az.rock.ide.view.ui.frame.GMainFrame;

public class IntroGScreen extends GMainFrame {

    private final static Stateful<IntroState> STATE = IntroState.factory();

    public IntroGScreen() {
        super("Rock IDEA");
    }

    @Override
    public void postConst() {

    }

    @Override
    public void initializer() {

    }
}
