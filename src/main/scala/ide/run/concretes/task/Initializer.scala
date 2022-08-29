package az.rock.ide.run.concretes.task

@FunctionalInterface trait Initializer {
  def init() : Unit

  def init[T](args: T*) = {
  }
}