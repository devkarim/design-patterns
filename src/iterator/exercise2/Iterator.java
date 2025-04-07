package iterator.exercise2;

public interface Iterator<T> {
    boolean hasNext();
    T current();
    void next();
}
