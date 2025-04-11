package command.composite;

public class Demo {
    public static void main(String[] args) {
        var composite = new CompositeCommand();
        composite.add(new BlackAndWhiteCommand());
        composite.add(new ResizeCommand());
        composite.execute();
    }
}
