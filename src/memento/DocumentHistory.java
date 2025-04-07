package memento;

import java.util.List;
import java.util.ArrayList;

public class DocumentHistory {
    private final List<DocumentState> states = new ArrayList<>();

    public void push(DocumentState state) {
        states.add(state);
    }

    public DocumentState pop() {
        return states.removeLast();
    }
}
