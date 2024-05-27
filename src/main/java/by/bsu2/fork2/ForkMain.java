package by.bsu2.fork2;

import java.util.concurrent.ForkJoinPool;

/**
 * Created by Ihar_Blinou on 5/22/2015.
 */
public class ForkMain {
    public static void main(String[] args) {
        Node root = new Node(1);

        Node node1 = new Node(2);
        root.getChildren().add(node1);


        new ForkJoinPool().invoke(new ValueSumCounter(root));
    }
}
