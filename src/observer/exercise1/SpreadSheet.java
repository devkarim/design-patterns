package observer.exercise1;

public class SpreadSheet implements Observer {
    private final DataSource dataSource;

    public SpreadSheet(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        System.out.println("SpreadSheet is notified: " + dataSource.getValue());
    }
}
