package by.bsu2.threads.synchro;
import java.io.*;
import java.util.concurrent.TimeUnit;

public class Resource {
    private FileWriter fileWriter;
    public Resource (String file) throws IOException {
        // insert here checking file
        fileWriter = new FileWriter(file, true);
    }
    public void writing(String str, int i) {
        try {
            fileWriter.append(str + i);
            System.out.print(str + i);
            TimeUnit.MILLISECONDS.sleep(10 + (int)(Math.random() * 40));
            fileWriter.append("->" + str.charAt(0) + i + " ");
            System.out.print("->"+ str.charAt(0) + i + " ");
        } catch (IOException e) {
            System.err.print("io problem: " + e);
        } catch (InterruptedException e) {
            System.err.print("thread problem: " + e);
        }
    }
}
