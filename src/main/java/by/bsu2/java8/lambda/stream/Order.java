package by.bsu2.java8.lambda.stream;

public class Order {
    private int orderId;
    private float amount;
    // поля и методы описания подробностей заказа

    public Order(int orderId, float amount) {
    this.orderId=orderId;
    this.amount=amount;
}

    public int getOrderId() {
        return orderId;
    }

    public float getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Order [orderId =" + orderId + ", amount=" + amount + "]";
    }
}
