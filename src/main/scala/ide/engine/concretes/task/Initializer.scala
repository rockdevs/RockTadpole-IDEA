package az.rock.ide.engine.concretes.task

@FunctionalInterface trait Initializer {
  def init() : Unit

  def init[T](args: T*) = {
  }
}