package by.bsu2.java8.defaultstrategy;

/**
 * Created by admin on 23.04.14.
 */
public class FunSolutionMain {
    public static void main(String[] args) {
        FunSolution f = (a, b) -> (a + b)/3 ;
        double d = f.defineSquare(4, 6);
    }
}
