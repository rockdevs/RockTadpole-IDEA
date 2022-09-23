package az.rock
package ide.engine.container.driven

trait Process {
  def drive(): Unit = {}

  def disposeProcess(): Unit = {}
}
