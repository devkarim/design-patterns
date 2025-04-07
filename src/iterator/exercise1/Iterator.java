package iterator.exercise1;

public interface Iterator<T> {
    boolean hasNext();
    T current();
    void next();
}
