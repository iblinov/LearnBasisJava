package by.bsu2.thread.barrier;
import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;

public class AuctionParticipant extends Thread {
    private Integer participantId;
    private int price;
    private int cash;
    private CyclicBarrier barrier;

    public AuctionParticipant(int id, int price, int cash, CyclicBarrier barrier) {
        this.participantId = id;
        this.price = price;
        this.cash = cash;
        this.barrier = barrier;
    }
    public Integer getBidId() {
        return participantId;
    }
    public int getPrice() {
        return price;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    @Override
    public void run() {
        try {
            System.out.println("Participant " + participantId + " specifies a price. (cash = " + cash + ")");
            TimeUnit.MILLISECONDS.sleep(new Random().nextInt(2500)); // время на раздумье
            // определение уровня повышения цены
            int delta = new Random().nextInt(20);
            price += delta;
            System.out.println("Participant " + participantId + " : " + price);
            this.barrier.await(); //   остановка у барьера
            System.out.println("Participant " + participantId + " Continue to work...(cash = " + cash + ")");
        } catch (BrokenBarrierException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
