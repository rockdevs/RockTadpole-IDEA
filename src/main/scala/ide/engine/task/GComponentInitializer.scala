package az.rock
package ide.engine.task

@FunctionalInterface trait GComponentInitializer {
  def init() : Unit

  def init[T](args: T*) = {
  }
}