package by.bsu2.threads.interrupt;

public class BreakMain {
  public static void main(String[] args) throws InterruptedException {
    CustomThread th = new CustomThread();
    th.start();
    Thread.sleep(100);
    th.interrupt();
  }
}
