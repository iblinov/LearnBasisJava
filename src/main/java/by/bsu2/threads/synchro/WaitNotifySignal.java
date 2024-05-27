package by.bsu2.threads.synchro;

public class WaitNotifySignal {
    private boolean ready;
    public synchronized void consume() {
        while(!ready) {
            try {
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        ready = false;
    }
    public synchronized void produce() {
        ready = true;
        notify();
    }
}
