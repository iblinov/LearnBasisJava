package by.bsu.java8.lambda.stream;

import java.util.List;

import java.util.ArrayList;
        import java.util.Iterator;


/**
 * @author Sergey Datskevich Oct 6, 2014 2:02:22 PM
 *
 *
 */

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 1000000; i++) {
            list.add((int) (Math.random()*20));
        }
        System.out.println(list);
        long time = System.nanoTime();
        int k = sumIterator(list);
        System.out.println((System.nanoTime()- time)+" --- "+k);
        time = System.nanoTime();
        int j = sumStream(list);
        System.out.println((System.nanoTime()- time)+" --- "+j);
    }

    private static int sumIterator(List<Integer> list) {
        Iterator<Integer> it = list.iterator();
        int sum = 0;
        while (it.hasNext()) {
            int num = it.next();
            if (num > 10) {
                sum += num;
            }
        }
        return sum;
    }

    private static int sumStream(List<Integer> list) {
        return list.stream().filter(i -> i > 10).mapToInt(i -> i).sum();
    }

}