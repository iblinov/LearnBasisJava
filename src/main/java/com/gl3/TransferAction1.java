package com.gl3;

public class TransferAction1 {
    private Account from;
    private Account to;
    private double transactionAsset;
    private boolean isDone;
    public TransferAction1(double asset, Account from, Account to) {
        if (asset > 0 && from != null && to != null ) {
            this.transactionAsset = asset;
            this.from = from;
            this.to = to;
        } else {
            throw new IllegalArgumentException(); // или собственное исключение
        }
    }
    public boolean isDone() {
        return isDone;
    }
    public void transferIntoAccount() {
        // определение остатка
        double demand = from.getAsset() - transactionAsset;
        // проверка остатка и перевод суммы
        if (demand >= 0) {
            from.setAsset(demand);
            to.addAsset(transactionAsset);
            isDone = true;
        }
    }

}


