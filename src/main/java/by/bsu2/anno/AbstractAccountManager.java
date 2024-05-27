package by.bsu2.anno;

public abstract class AbstractAccountManager implements AccountManager {
    private AccountManager securityAccount;
    protected AbstractAccountManager() {
        securityAccount =  SecurityFactory.createSecurityObject(this);
    }
    public AccountManager getSecurityAccount() {
        return securityAccount;
    }
}
