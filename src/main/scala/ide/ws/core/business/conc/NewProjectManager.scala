package az.rock
package ide.ws.core.business.conc

import ide.ws.core.business.abst.NewProjectService

class NewProjectManager extends NewProjectService{
  override def live(value: String): String = {
    System.out.println("Accepted{}"+value)
    value
  }
}
