package az.rock
package ide.service.core.business.concretes

import ide.service.core.business.traits.NewProjectService

class NewProjectManager extends NewProjectService{
  override def live(value: String): String = {
    System.out.println("Accepted{}"+value)
    value
  }
}
