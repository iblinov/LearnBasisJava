package by.bsu2.anno;

public interface AccountManager {
    double depositInCash(int accountNumber, int amount);
    boolean withdraw(int accountNumber, int amount);
    boolean convert(double amount);
    boolean transfer(int accountNumber, double amount);
}
