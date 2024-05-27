package by.bsu2.annotation;
public class AccountManagerImpl implements AccountManager {
    @BankingAnnotation(securityLevel = SecurityLevel.HIGH)
    public double depositInCash(int accountNumber, int amount) {
        // зачисление на депозит
        return 0; // stub
    }
    @BankingAnnotation(securityLevel = SecurityLevel.HIGH)
    public boolean withdraw(int accountNumber, int amount) {
        // снятие суммы, если не превышает остаток
        return true; // stub
    }
  //  @BankingAnnotation(securityLevel = SecurityLevel.LOW)
    public boolean convert(double amount) {
        // конвертировать сумму
        return true; // stub
    }
    @BankingAnnotation
    public boolean transfer(int accountNumber, double amount) {
        // перевести сумму на счет
        return true; // stub
    }
}
