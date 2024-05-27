package by.bsu2.threads.synchro;
import java.io.IOException;
public class SynchroRun {
    public static void main(String[ ] args)  {
        Resource resource;
        try {
            resource = new Resource("text\\result.txt");
            SyncThread t1 = new SyncThread("First", resource);
            SyncThread t2 = new SyncThread("Second", resource);
            t1.start();
            t2.start();
        } catch (IOException e) {
            System.err.println("io problem: " + e);
        }
    }
}
