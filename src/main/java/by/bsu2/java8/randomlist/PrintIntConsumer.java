package by.bsu2.java8.randomlist;



import java.util.List;
import java.util.function.Consumer;

/**
 * Created by Ihar_Blinou on 2/5/2015.
 */
public class PrintIntConsumer implements Consumer<Integer> {

    @Override
    public void accept(Integer value) {
        System.out.print(value + "; ");
    }
}
