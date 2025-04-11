package command.exercise2;

public class BoldCommand implements UndoableCommand {
    private String prevContent;
    private final History history;
    private final HtmlDocument document;

    public BoldCommand(History history, HtmlDocument document) {
        this.history = history;
        this.document = document;
    }

    @Override
    public void execute() {
        prevContent = document.getContent();
        document.makeBold();
        history.push(this);
    }

    @Override
    public void unexecute() {
        document.setContent(prevContent);
    }
}
