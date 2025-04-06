package iterator;

import java.util.ArrayList;
import java.util.List;

public class ListIterator<T> implements Iterator<T> {
    private final List<T> arr;
    private int index;

    public ListIterator(List<T> arr) {
        this.arr = arr;
    }

    @Override
    public boolean hasNext() {
        return index < arr.size();
    }

    @Override
    public T current() {
        return arr.get(index);
    }

    @Override
    public void next() {
        index++;
    }
}
