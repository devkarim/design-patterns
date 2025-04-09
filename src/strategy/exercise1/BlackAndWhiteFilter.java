package strategy.exercise1;

public class BlackAndWhiteFilter implements Filter {
    @Override
    public void apply(String fileName) {
        System.out.println("Applying B&W filter");
    }
}
