package az.rock.ide.view.state.model

import az.rock.ide.view.state.Stateful

object IntroState {
  def factory = new Stateful(new IntroState)
}

class IntroState {}