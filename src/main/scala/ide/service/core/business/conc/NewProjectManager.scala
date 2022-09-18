package az.rock
package ide.service.core.business.conc

import ide.service.core.business.abst.NewProjectService

class NewProjectManager extends NewProjectService{
  override def live(value: String): String = {
    System.out.println("Accepted{}"+value)
    value
  }
}
