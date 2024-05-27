package by.bsu2.threads.latch;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class Tutor extends Thread {
    private List<Student> list;
    static CountDownLatch latch;

    public Tutor(List<Student> list) {
        this.list = list;
        latch = new CountDownLatch(list.size());
    }
    public void run() {
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (Student st : list) {
            // проверить, выданы ли студенту задания
            List<Task> tasks = st.getTaskList();
            for (Task current : tasks) {
                // проверить наличие ответа!
                try {
                    TimeUnit.MILLISECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int mark = 3 + new Random().nextInt(7);
                current.setMark(mark);
                System.out.println(mark + " for student N "
                        + st.getStudentId());

            }
            st.getCountDownLatch().countDown();
            System.out.println("All estimates made for " + st.getStudentId());

        }
    }

    public CountDownLatch getLatch() {
        return latch;
    }
}
