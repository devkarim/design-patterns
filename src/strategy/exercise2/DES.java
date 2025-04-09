package strategy.exercise2;

public class DES implements EncryptionStrategy {
    @Override
    public void encrypt(String message) {
        System.out.println("Encrypting using DES");
    }
}
