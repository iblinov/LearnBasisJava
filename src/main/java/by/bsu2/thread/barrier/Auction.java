package by.bsu2.thread.barrier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.CyclicBarrier;

public class Auction {
    private ArrayList<AuctionParticipant> bids;
    private CyclicBarrier barrier;
    public final int BIDS_NUMBER = 5;

    public Auction() {
        this.bids = new ArrayList<>();
        this.barrier = new CyclicBarrier(this.BIDS_NUMBER, () -> Auction.this.defineWinner());
    }

    public CyclicBarrier getBarrier() {
        return barrier;
    }
    public boolean add(AuctionParticipant e) {
        return bids.add(e);
    }

    public ArrayList<AuctionParticipant> getBids() {
        return bids;
    }

    public AuctionParticipant defineWinner() {
        AuctionParticipant winner =  Collections.max(bids, Comparator.comparingInt(AuctionParticipant::getPrice));
        System.out.println("Participant #" + winner.getBidId() + ", price:"
                + winner.getPrice() + " win!");
        winner.setCash(winner.getCash() - winner.getPrice());
        return winner;
    }
}
