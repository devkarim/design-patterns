package memento.exercise2;

public class Editor {
    private String content;

    public EditorState createState() {
        return new EditorState(content);
    }

    public void restore(EditorState state) {
        this.content = state.getContent();
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
