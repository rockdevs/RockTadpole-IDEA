package az.rock
package ide.view.ui

@FunctionalInterface trait GComponentInitializer {
  def init(): Unit

  def init[T](args: T*) = {
  }
}
