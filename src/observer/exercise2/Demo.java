package observer.exercise2;

public class Demo {
    public static void main(String[] args) {
        var stock1 = new Stock("ABC", 40);
        var stock2 = new Stock("XYZ", 20);

        var stockListView = new StockListView();
        var statusBar = new StatusBar();

        stockListView.addStock(stock1);
        stockListView.addStock(stock2);
        statusBar.addStock(stock1);

        stock1.setPrice(50);
        stock2.setPrice(30);
    }
}
