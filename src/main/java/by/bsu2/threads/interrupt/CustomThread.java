package by.bsu2.threads.interrupt;

public class CustomThread extends Thread {
  @Override
  public void run() {
    int i = 0;
    try {
      //while (!isInterrupted()) {
      while (true) {
        System.out.println("running " + ++i);
        //Thread.sleep(100);
      }
//    } catch (InterruptedException e) {
//      System.out.println("Поток прерван!");
    } finally {
      System.out.println("fin");
    }
  }
}