import iterator.BrowseHistory;
import iterator.Iterator;

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
        // State Pattern
//        Canvas canvas = new Canvas();
//
//        canvas.setCurrentTool(new EraserTool());
//        canvas.mouseDown();
//        canvas.mouseUp();
//
//        canvas.setCurrentTool(new BrushTool());
//        canvas.mouseDown();
//        canvas.mouseUp();
        // Memento Pattern
//        var editor = new Editor();
//        var history = new History();
//
//        editor.setContent("a");
//        history.push(editor.createState());
//
//        editor.setContent("b");
//        history.push(editor.createState());
//
//        editor.setContent("c");
//        editor.restore(history.pop());
//
//        System.out.println(editor.getContent());
    }
}