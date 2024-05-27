package by.bsu2.phaser;

public class Bet {
    private Gambler gambler;
    private Event event;
    private int prediction;
    private double amount;

    public Bet(Gambler gambler, Event event, int prediction, double amount) {
        this.gambler = gambler;
        this.event = event;
        this.prediction = prediction;
        this.amount = amount;
    }

    public Gambler getGambler() {
        return gambler;
    }

    public void setGambler(Gambler gambler) {
        this.gambler = gambler;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public int getPrediction() {
        return prediction;
    }

    public void setPrediction(int prediction) {
        this.prediction = prediction;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
