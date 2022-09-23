package az.rock
package ide.engine.task

@FunctionalInterface trait Initializer {
  def init() : Unit

  def init[T](args: T*) = {
  }
}