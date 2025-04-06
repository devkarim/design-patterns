import state.BrushTool;
import state.Canvas;
import state.EraserTool;

public class Main {
    public static void main(String[] args) {
        // State Pattern
        Canvas canvas = new Canvas();

        canvas.setCurrentTool(new EraserTool());
        canvas.mouseDown();
        canvas.mouseUp();

        canvas.setCurrentTool(new BrushTool());
        canvas.mouseDown();
        canvas.mouseUp();
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