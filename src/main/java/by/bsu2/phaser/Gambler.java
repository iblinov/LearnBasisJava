package by.bsu2.phaser;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Phaser;

public class Gambler extends Thread{
    private final double INITIAL_CASH;
    private Phaser phaser;
    private String name;
    private double cash;
    private BookMaker bookMaker;


    public Gambler(Phaser phaser, String name, double cash, BookMaker bookMaker){
        this.phaser = phaser;
        this.name = name;
        this.cash = cash;
        INITIAL_CASH = cash;
        this.bookMaker = bookMaker;
        phaser.register();
    }

    @Override
    public void run(){
        while (!phaser.isTerminated()){
            this.makeBets();
            phaser.arriveAndAwaitAdvance();
            //wait the results
            try {
                //time to think
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println("Gambler "+name+" was interrupted");
            }
            phaser.arriveAndAwaitAdvance();
            spendSomeMoney();
            phaser.arriveAndAwaitAdvance();
        }
    }

    private void makeBets(){
        Random random = new Random();
        if (cash > 0){
            List<Integer> eventsNumber = new ArrayList<>();
            for (int i=1; i<bookMaker.getEvents().size(); i++) {
                eventsNumber.add(new Integer(i));
            }
            Collections.shuffle(eventsNumber);
            //each player makes 3 bets for different events
            for (int i=0; i<4; i++) {
                try {
                    //time to think
                    Thread.sleep(50+random.nextInt(300));
                } catch (InterruptedException e) {
                    System.out.println("Gambler "+name+" was interrupted");
                }
                Event event = bookMaker.getEvents().get(random.nextInt(bookMaker.getEvents().size()));
                double inversed1 = 1/(event.getWinFirst()-1);
                double inversed2 = 1/(event.getWinSecond()-1);
                int prediction = random.nextDouble() < inversed1/(inversed1 + inversed2)? 1 : 2;
                // from 10% to 100% of cash
                double betAmount = cash*0.1+cash*0.9*random.nextDouble();
                bookMaker.registerBet(new Bet(this, event, prediction, betAmount));
            }

        }
    }

    private void spendSomeMoney(){
        //we earn some money! Spend a little bit
        if (INITIAL_CASH < cash*0.9){
            double spent = cash*0.1*new Random().nextDouble();
            System.out.println("Gambler "+name+" spent "+spent);
            cash -= spent;
        }
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public String getPlayerName() {
        return name;
    }

    public void setPlayerName(String name) {
        this.name = name;
    }
}
