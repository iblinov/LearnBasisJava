package com.gl3;

public class TransferAction {
    public boolean transferIntoAccount(double asset, Account from, Account to) {
        if (asset <= 0 || from == null || to == null ) {
            throw new IllegalArgumentException(); // или собственное исключение
        }
        // определение остатка
        boolean isDone = false;
        double demand = from.getAsset() - asset;
        // проверка остатка и перевод суммы
        if (demand >= 0) {
            from.setAsset(demand);
            to.addAsset(asset);
            isDone = true;
        }
        return isDone;
    }
}

