package command.exercise3;

public class SetVideoContrastCommand extends AbstractUndoableCommand {
    private float prevContrast;
    private final float contrast;

    public SetVideoContrastCommand(float contrast, VideoEditor editor, History history) {
        super(editor, history);
        this.contrast = contrast;
    }

    @Override
    protected void doExecute() {
        prevContrast = editor.getContrast();
        editor.setContrast(contrast);
    }

    @Override
    public void undo() {
        editor.setContrast(prevContrast);
    }
}
