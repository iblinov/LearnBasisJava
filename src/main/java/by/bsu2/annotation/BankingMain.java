package by.bsu2.annotation;
public class BankingMain {
    public static void main(String[] args) {
        AccountManager manager = new AccountManagerImpl();
        // "регистрация класса" для включения аннотаций в обработку.
        manager = SecurityFactory.createSecurityObject(manager);
        manager.depositInCash(10128336, 6);
        manager.withdraw(64092376, 2);
        manager.convert(200);
        manager.transfer(64092376, 300);


    }
}
