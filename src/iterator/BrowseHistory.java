package iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {
    private final List<String> history = new ArrayList<>();

    public void push(String item) {
        history.add(item);
    }

    public String pop() {
        return history.removeLast();
    }

    public Iterator<String> createIterator() {
        return new ListIterator<>(history);
    }
}
