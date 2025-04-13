package observer.exercise1;

public class Demo {
    public static void main(String[] args) {
        var dataSource = new DataSource();

        var spreadSheet1 = new SpreadSheet(dataSource);
        var spreadSheet2 = new SpreadSheet(dataSource);
        var chart = new Chart(dataSource);

        dataSource.addObserver(spreadSheet1);
        dataSource.addObserver(spreadSheet2);
        dataSource.addObserver(chart);

        dataSource.setValue(2);
    }
}
