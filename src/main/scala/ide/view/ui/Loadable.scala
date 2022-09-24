package az.rock
package ide.view.ui

trait Loadable {
  def postConst(): Unit

  def componentInitializer(): Unit
}
