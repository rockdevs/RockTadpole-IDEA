package az.rock
package ide.engine.container.process

trait Process {
  def drive(): Unit = {}

  def disposeProcess(): Unit = {}
}
