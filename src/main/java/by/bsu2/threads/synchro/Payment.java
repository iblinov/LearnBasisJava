package by.bsu2.threads.synchro;
import java.util.Scanner;

public class Payment {
    private int amount;
    private boolean closed;

    public int getAmount() {
        return amount;
    }
    public boolean isClosed() {
        return closed;
    }
    public void setClosed(boolean closed) {
        this.closed = closed;
    }
    public synchronized void doPayment() {
        try {
            System.out.println("Start payment:");
            while (amount <= 0) {
                this.wait();
            }
            // payment
            closed = true;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Payment is closed : " + closed);
    }
    public synchronized void init() {
        System.out.println("Init amount:");
        amount = new Scanner(System.in).nextInt();
        this.notify();
    }
}
