package by.bsu2.threads.synchro;

import java.util.concurrent.TimeUnit;

public class PaymentRunner {
    public static void main(String[] args) throws InterruptedException {
        final Payment payment = new Payment();
        new Thread(() -> payment.doPayment()).start();
        TimeUnit.MILLISECONDS.sleep(200);
        payment.init();
        synchronized (payment) {
            payment.wait(1_000);
            System.out.println("end");
        }
    }
}
