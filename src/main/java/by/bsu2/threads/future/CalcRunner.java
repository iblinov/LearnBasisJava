package by.bsu2.threads.future;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CalcRunner {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Long> future = executorService.submit(new IdRandomGenerator());
      // Thread.sleep(1000);
        // future. cancel(true);
        //executorService.shutdown(); // останавливает исполнителя, но не поток
        executorService.shutdownNow();//останавливает и исполнителя и поток
        System.out.println("after shutdown");
        try {
            if (!future.isCancelled()) {
                System.out.println(future.get());
            } else {
                System.out.println("Сancel: "+future.isCancelled());
            }
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

//        System.out.println(IdGenerator.generate());
//        String base = "";
//        Random random = new Random();
//        base += (char)random.nextInt(127);
//        byte[] bytes = new byte[0];
//        try {
//            bytes = base.getBytes("UTF-8");
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }
//        UUID uuid = UUID.nameUUIDFromBytes(bytes);
//        System.out.println(uuid);
    }
}
