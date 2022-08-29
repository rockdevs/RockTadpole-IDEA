package az.rock.ide.core.concretes.task;

@FunctionalInterface
public interface Initializer {
    void init();
    default <T> void init(T... args){};
}
