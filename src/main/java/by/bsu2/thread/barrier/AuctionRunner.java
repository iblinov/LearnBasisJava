package by.bsu2.thread.barrier;
import java.util.Random;

public class AuctionRunner {
    public static void main(String[] args) {
        Auction auction = new Auction();
        int startPrice = new Random().nextInt(50);

        for (int i = 0; i < auction.BIDS_NUMBER; i++) {
            int cash = 100 + new Random().nextInt(100);
            AuctionParticipant bid = new AuctionParticipant(i, startPrice, cash, auction.getBarrier());
            auction.add(bid);
            bid.start();
        }
    }
}

