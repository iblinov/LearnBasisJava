package by.streamprj.entity;


public class Order {
    private int orderId;
    private float amount;
    private String descriptuion;
    public Order(int orderId, float amount) {
        this.orderId = orderId;
        this.amount = amount;
    }
    public int getOrderId () {
        return orderId;
    }
    public float getAmount() {
        return amount;
    }

    public String getDescriptuion() {
        return descriptuion;
    }

    public void setDescriptuion(String descriptuion) {
        this.descriptuion = descriptuion;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "id=" + orderId + ", amount=" + amount + "\n";
    }
}
