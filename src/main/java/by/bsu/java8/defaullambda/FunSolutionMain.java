package by.bsu.java8.defaullambda;

/**
 * Created by admin on 23.04.14.
 */
public class FunSolutionMain {
    public static void main(String[] args) {
        FunSolution f = (a, b) -> (a + b)/3 ;
        double d = f.defineSquare(4, 6);
    }
}
