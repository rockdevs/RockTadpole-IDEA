package az.rock.ide.view.state.model

import az.rock.ide.view.state.Stateful
import az.rock.ide.view.state.Stateful

object MainState {
  def factory: Any = Stateful[MainState](new MainState)
}

class MainState {}