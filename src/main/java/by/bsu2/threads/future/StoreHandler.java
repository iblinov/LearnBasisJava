package by.bsu2.threads.future;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class StoreHandler implements Callable<String> {
    @Override
    public String call() throws Exception {
        String product = ProductStore.poll();
        String result;
        if (product != null) {
            result = product + " done";
        } else {
            result = "Store is empty";
        }
        TimeUnit.MILLISECONDS.sleep(100);
        System.out.println(result);
        return result;
    }
}
