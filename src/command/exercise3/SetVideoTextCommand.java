package command.exercise3;

public class SetVideoTextCommand extends AbstractUndoableCommand {
    private final String text;

    public SetVideoTextCommand(String text, VideoEditor editor, History history) {
        super(editor, history);
        this.text = text;
    }

    @Override
    protected void doExecute() {
        editor.setText(text);
    }

    @Override
    public void undo() {
        editor.removeText();
    }
}
