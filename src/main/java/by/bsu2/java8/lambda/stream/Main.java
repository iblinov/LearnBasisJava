package by.bsu2.java8.lambda.stream;

import java.util.List;

import java.util.ArrayList;
        import java.util.Iterator;



public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 1000000; i++) {
            list.add((int) (Math.random()*20));
        }
        System.out.println(list);
        long time = System.currentTimeMillis();
        int k = sumIterator(list);
        System.out.println((System.currentTimeMillis()- time)+" --- "+k);
        time = System.currentTimeMillis();
        int j = sumStream(list);
        System.out.println((System.currentTimeMillis()- time)+" --- "+j);


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