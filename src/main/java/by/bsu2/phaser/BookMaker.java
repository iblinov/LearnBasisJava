package by.bsu2.phaser;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Phaser;

public class BookMaker extends Thread {

    private static final float MARGIN = 0.05f;
    private int eventId = 1;
    private List<Event> events = new ArrayList<>();
    private List<Bet> bets = new ArrayList<>();
    private double bookMakerProfit;
    private Phaser phaser;
    private List<Gambler> gamblers;

    public BookMaker(Phaser phaser) {
        this.phaser = phaser;
    }

    @Override
    public void run() {
        Random rand = new Random();
        while (!phaser.isTerminated()) {
            //wait for bets
            System.out.println("_____________________ WAITING FOR BETS _____________________");
            phaser.arriveAndAwaitAdvance();
            System.out.println("_____________________ START PAY MONEY _____________________");
            payMoney();
            phaser.arriveAndAwaitAdvance();
            System.out.println("_____________________ START GENERATE NEW EVENTS, PLAYERS SPEND MONEY_____________________");
            generateEvents(rand);
            bets.clear();
            phaser.arriveAndAwaitAdvance();
            System.out.println("Bookmaker profit: " + bookMakerProfit);
        }
        System.out.println("_____________________ COLLECTING RESULTS _____________________");
        for (Gambler gambler : gamblers){
            System.out.println(String.format("Gambler %s has %f", gambler.getPlayerName(), gambler.getCash()));
        }
        System.out.println("Bookmaker profit: "+bookMakerProfit);
    }

    public void generateEvents(Random rand) {
        events.clear();
        for (int i = 0; i < 10; i++) {
            events.add(generateEvent(rand, MARGIN));
        }
    }

    public void registerBet(Bet bet) {
        if (bet.getGambler().getCash() > bet.getAmount()) {
            bets.add(bet);
            bet.getGambler().setCash(bet.getGambler().getCash() - bet.getAmount());
        } else {
            System.out.println(String.format("Gambler %s tries to make bet with amount %f but has only %f", bet.getGambler().getPlayerName()));
        }
    }

    private Event generateEvent(Random rand, float margin) {
        float winFirst = 1 + rand.nextFloat() * 2;
        float winSecond = 1 / (1 / (1 - margin) - 1 / winFirst);
        return new Event("Event #" + eventId++, winFirst, winSecond);
    }

    private void payMoney() {
        List<Integer> eventResults = new ArrayList<>();
        Random random = new Random();
        for (Event event : events) {
            double inversed1 = 1 / (event.getWinFirst() - 1);
            double inversed2 = 1 / (event.getWinSecond() - 1);
            eventResults.add(random.nextDouble() < inversed1 / (inversed1 + inversed2) ? 1 : 2);
        }
        for (Bet bet : bets) {
            if (bet.getPrediction() == eventResults.get(events.indexOf(bet.getEvent()))) {
                double win = bet.getAmount() * (bet.getPrediction() == 1 ? bet.getEvent().getWinFirst() : bet.getEvent().getWinSecond());
                bet.getGambler().setCash(bet.getGambler().getCash() + win);
                bookMakerProfit -= win - bet.getAmount();
                System.out.println(String.format("Gambler %s won %f", bet.getGambler().getPlayerName(), win));
            } else {
                bookMakerProfit += bet.getAmount();
            }
        }
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setGamblers(List<Gambler> gamblers) {
        this.gamblers = gamblers;
    }
}
