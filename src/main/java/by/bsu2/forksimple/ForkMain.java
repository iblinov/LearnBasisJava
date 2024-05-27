package by.bsu2.forksimple;

import java.util.concurrent.ForkJoinPool;

/**
 * Created by Ihar_Blinou on 5/22/2015.
 */
public class ForkMain {
    public static void main(String[] args) {
        NodeImpl root = new NodeImpl();
        new ForkJoinPool().invoke(new ValueSumCounter(root));
    }
}
