package by.bsu2.threads.synchro;

public class BufferThreadRunner {
    static int counter = 0;
    //static StringBuffer buffer = new StringBuffer();
    static StringBuilder buffer = new StringBuilder();
    public static void main(String args[])  {
        new Thread(() -> {
            synchronized (buffer) {
                while (counter++ < 3) {
                    buffer.append("A");
                    System.out.println("> " + counter + " " + buffer);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            } // конец synchronized-блока
        }).start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        do {
            // в этом месте поток main будет ждать
            // освобождения блокировки объекта buffer
            buffer.append("B");
            System.out.println("< " + counter + " " + buffer);
        } while (counter++ < 6);
    }
}
