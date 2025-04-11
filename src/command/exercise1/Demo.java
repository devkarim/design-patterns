package command.exercise1;

public class Demo {
    public static void main(String[] args) {
        var customerService = new CustomerService();
        var cmd = new AddCustomerCommand(customerService);
        var button = new Button(cmd);
        button.click();
    }
}
