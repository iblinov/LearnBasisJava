package by.bsu2.java8.defaultstrategy.threads;

/**
 * Created by Ihar_Blinou on 6/19/2015.
 */
public class ThreadRunner {
    public static void main(String[] args) {

        new Thread(() -> System.out.println("talk")).start();
    }
}
