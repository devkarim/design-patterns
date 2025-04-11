package command.exercise3;

public abstract class AbstractUndoableCommand implements UndoableCommand {
    protected final VideoEditor editor;
    protected final History history;

    public AbstractUndoableCommand(VideoEditor editor, History history) {
        this.editor = editor;
        this.history = history;
    }

    @Override
    public void execute() {
        doExecute();
        history.push(this);
    }

    abstract protected void doExecute();
}
