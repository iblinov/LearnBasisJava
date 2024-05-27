package by.bsu2.phaser;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Phaser;

public class Main {
    private static final int ITERATIONS_COUNT = 6;

    public static void main(String[] args) throws InterruptedException {

        Random rand = new Random();

        Phaser phaser = new Phaser() {
            private int iterations = ITERATIONS_COUNT;
            @Override
            protected boolean onAdvance(int phase, int registeredParties) {
                //three phases per iteration
                return phase >= 3 * iterations - 1;
            }
        };
        phaser.register();
        BookMaker bookMaker = new BookMaker(phaser);
        bookMaker.generateEvents(rand);
        List<Gambler> gamblers = Arrays.asList(new Gambler(phaser, "#1", 100, bookMaker),
                new Gambler(phaser, "#2", 100, bookMaker),
                new Gambler(phaser, "#3", 100, bookMaker),
                new Gambler(phaser, "#4", 100, bookMaker));
        bookMaker.setGamblers(gamblers);

        bookMaker.start();
        gamblers.forEach(Thread::start);
    }
}
