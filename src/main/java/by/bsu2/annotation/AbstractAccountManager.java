package by.bsu2.annotation;

public abstract class AbstractAccountManager implements AccountManager {
    private AccountManager securityAccount;
    protected AbstractAccountManager() {
        securityAccount =  SecurityFactory.createSecurityObject(this);
    }
    public AccountManager getSecurityAccount() {
        return securityAccount;
    }
}
