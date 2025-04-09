package strategy.exercise2;

public class Demo {
    public static void main(String[] args) {
        var chatClient = new ChatClient();
        chatClient.send("Hello", new DES());
        chatClient.send("Bye", new AES());
    }
}
