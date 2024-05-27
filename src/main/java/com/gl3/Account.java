package com.gl3;

public class Account {
    private long accountId;
    private double asset;
    // конструктор без параметров
    public Account() { // наличие этого конструктора некорректно по смыслу класса
        super();
    /* но, если класс будет объявлен вообще без конструктора, то компилятор предоставит его именно в таком виде */
    }
    // конструктор с параметром
    public Account(long accountId) {
        super(); /* обращение к конструктору суперкласса явным образом необязателено, компилятор добавит его автоматически */
        this.accountId = accountId;
    }
    // конструктор с параметрами
    public Account(long accountId, double asset) {
        this.accountId = accountId;
        this.asset = asset;
    }

    public double getAsset() {
        return asset;
    }

    public void setAsset(double asset) {
        this.asset = asset;
    }

    public long getAccountId () {
        return accountId;
    }
    public void setId(long accountId) {
        // здесь может быть проверка на корректность
        this.accountId = accountId;
    }
    public void addAsset (double asset) {
    /* данный метод в общем случае можно объявлять в другом классе */
        this.asset += asset;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", asset=" + asset +
                '}';
    }
}
