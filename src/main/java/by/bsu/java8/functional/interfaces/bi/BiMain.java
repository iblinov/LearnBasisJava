package by.bsu.java8.functional.interfaces.bi;

import java.util.function.BiFunction;

/**
 * Created by Ihar_Blinou on 9/5/2014.
 */
interface RunnableThrow {
    void runner() throws InterruptedException;
}
public class BiMain {
    public static void main(String[] args) {
        BiFunction<String, String, Integer> comp
                = (first, second) -> Integer.compare(first.length() , second.length()) ;
        System.out.println(comp.apply("567", "45jkjk"));

      //  Runnable sleeper = ()->{ System.out.println("Zzz"); Thread.sleep(1000); };
        RunnableThrow sleeper = ()->{ System.out.println("Zzz"); Thread.sleep(1000); };
    }
}
