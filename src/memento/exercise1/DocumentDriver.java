package memento.exercise1;

public class DocumentDriver {
    public static void main(String[] args) {
        var doc = new Document();
        var history = new DocumentHistory();

        doc.setContent("Hello");
        history.push(doc.createState());

        doc.setFontName("Arial");
        history.push(doc.createState());

        doc.setFontSize(10);

        System.out.println(doc);

        doc.restore(history.pop());
        System.out.println(doc);

        doc.restore(history.pop());
        System.out.println(doc);
    }
}
