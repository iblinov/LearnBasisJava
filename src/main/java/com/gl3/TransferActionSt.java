package com.gl3;

public class TransferActionSt {
    public static int taxRate = 12; // статическое поле
    private double amountTaxes; // нестатическое поле
    public double getAmountTaxes() { // нестатический метод
        return amountTaxes;
    }
    public static void increaseTaxRate() { // статический метод
        // использовать this невозможно – объекта не существует
        // amountTaxes недоступен – объекта не существует
        /* методы getAmountTaxes и transferIntoAccount вызвать нельзя – объекта не существует */
        taxRate++;
    }
    public boolean transferIntoAccount(double asset, Account from, Account to) {
        if (asset <= 0 || from == null || to == null ) {
            throw new IllegalArgumentException(); // или собственное исключение
        }
        boolean isDone = false;
        double currentAmountTaxes = asset/taxRate;
        amountTaxes += currentAmountTaxes;
        double demand = from.getAsset() - asset *( 1 + currentAmountTaxes);
        if (demand >= 0) {

            from.setAsset(demand);
            to.addAsset(asset);
            isDone = true;
        }
        return isDone;
    }
}
