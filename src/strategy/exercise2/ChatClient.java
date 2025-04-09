package strategy.exercise2;

public class ChatClient {
    public void send(String message, EncryptionStrategy encryptionStrategy) {
        encryptionStrategy.encrypt(message);
        System.out.println("Sending the encrypted message...");
    }
}
