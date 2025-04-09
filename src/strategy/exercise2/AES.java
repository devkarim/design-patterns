package strategy.exercise2;

public class AES implements EncryptionStrategy {
    @Override
    public void encrypt(String message) {
        System.out.println("Encrypting using AES");
    }
}
