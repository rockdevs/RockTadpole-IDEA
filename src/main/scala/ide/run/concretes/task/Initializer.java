package az.rock.ide.run.concretes.task;

@FunctionalInterface
public interface Initializer {
    void init();
    default <T> void init(T... args){};
}
