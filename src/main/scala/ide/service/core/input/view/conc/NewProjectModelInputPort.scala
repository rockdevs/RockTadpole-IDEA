package az.rock
package ide.service.core.input.view.conc

import ide.service.core.input.view.abst.NewProjectModelInputAdapter

class NewProjectModelInputPort extends NewProjectModelInputAdapter{
  override def live(value: String): String = {
    value
  }
}
