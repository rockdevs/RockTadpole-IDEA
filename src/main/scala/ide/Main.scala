package az.rock
package ide

import ide.Main.args
import ide.run.concretes.RunnableApplication
object Main extends App {
  private val application = new RunnableApplication()
  application.run()
}