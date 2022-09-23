package az.rock
package ide.ws.core.api.input.view.conc

import az.rock.ide.ws.core.api.input.view.abst.NewProjectModelInputAdapter

class NewProjectModelInputPort extends NewProjectModelInputAdapter{
  override def live(value: String): String = {
    value
  }
}
