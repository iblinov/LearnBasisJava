package by.bsu2.threads.future;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class RunHandlerList {
    public static void main(String[] args) {

        ExecutorService es = Executors.newCachedThreadPool();
        List<StoreHandler> handlers= new ArrayList<>();

        List<Future<String>> list = null;
        try {
            list = es.invokeAll(handlers);
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
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
