package by.bsu2.threads.synchro;

import java.util.concurrent.TimeUnit;

public class PaymentLockRunner {
    public static void main(String[] args) throws InterruptedException {
        final PaymentLock payment = new PaymentLock();
        new Thread(() ->  payment.doPayment()).start();
        TimeUnit.MILLISECONDS.sleep(200);
        payment.init();
        System.out.println("the end");
    }
}

