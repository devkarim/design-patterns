import iterator.exercise1.BrowseHistory;
import iterator.exercise1.Iterator;

public class Main {
    public static void main(String[] args) {
        // Iterator Pattern
        var history = new BrowseHistory();
        history.push("a");
        history.push("b");
        history.push("c");

        Iterator<String> iterator = history.createIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.current());
            iterator.next();
        }
    }
}