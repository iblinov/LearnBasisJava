package by.bsu2.threads.synchro;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

import static java.util.concurrent.TimeUnit.DAYS;
import static java.util.concurrent.TimeUnit.SECONDS;

public class LockMain {
    ReentrantLock lock = new ReentrantLock();
    Condition condition = lock.newCondition();
    void m() throws InterruptedException {

        if(lock.tryLock(42, SECONDS)) {
            try {
                condition.await();

                // code
            } finally {
                lock.unlock();
            }
        }
        // code
    }
}
