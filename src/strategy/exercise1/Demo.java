package strategy.exercise1;

public class Demo {
    public static void main(String[] args) {
        var imageStorage = new ImageStorage();
        imageStorage.store("a", new JpegComrpessor(), new BlackAndWhiteFilter());
    }
}
