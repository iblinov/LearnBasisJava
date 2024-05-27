package by.bsu2.threads.future;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class RunHandler {
    public static void main(String[] args) {

        ExecutorService es = Executors.newFixedThreadPool(3);
        ArrayList<Future<String>> list =
                new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            list.add(es.submit(new StoreHandler()));
        }
        for (Future<String> future : list) {
            try {
                System.out.println(future.get() + " result fixed");
            } catch (InterruptedException  | ExecutionException e) {
                e.printStackTrace();
            }
        }
    }
}
