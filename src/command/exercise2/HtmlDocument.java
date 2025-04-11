package command.exercise2;

public class HtmlDocument {
    private String content;

    public void makeBold() {
        this.content = "<b>" + content + "</b>";
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
