package command.exercise3;

public class Demo {
    public static void main(String[] args) {
        var editor = new VideoEditor();
        var history = new History();

        var setTextCommand = new SetVideoTextCommand("My Title", editor, history);
        setTextCommand.execute();
        System.out.println("Text: " + editor);

        var setContrastCommand = new SetVideoContrastCommand(1, editor, history);
        setContrastCommand.execute();
        System.out.println("Contrast: " + editor);

        var undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println("Undo: " + editor);

        undoCommand.execute();
        System.out.println("Undo: " + editor);

        undoCommand.execute();
        System.out.println("Undo: " + editor);
    }
}
