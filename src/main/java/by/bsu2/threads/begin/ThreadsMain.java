package by.bsu2.threads.begin;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadsMain {
    public static void main(String[] args) throws InterruptedException {
        TalkThread talkThread = new TalkThread();
        Thread thread = new Thread(new WalkRunnable());
        System.out.println(talkThread.getState() +" 1");
        talkThread.start();
        System.out.println(talkThread.getState()+" 2");
     //   thread.start();
        TimeUnit.MILLISECONDS.sleep(100);
        System.out.println(talkThread.getState()+" 3");
        new Thread(talkThread).start();
//        System.out.println("end");
//        ExecutorService executorService =
//                Executors.newSingleThreadExecutor();
//      //  executorService.execute(thread);
//       executorService.submit(talkThread);
//        System.out.println(talkThread.getState()+" 4");
//        executorService.submit(talkThread);
//        System.out.println(talkThread.getState()+" 5");
    }
}
