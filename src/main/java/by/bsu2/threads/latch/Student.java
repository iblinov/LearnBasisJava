package by.bsu2.threads.latch;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.Random;

public class Student extends Thread {
    private Integer studentId;
    private List<Task> taskList;
    private CountDownLatch countDown = new CountDownLatch(1);;

    public Student(Integer idStudent, int numberTasks) {
        this.studentId = idStudent;
        this.taskList = new ArrayList<Task>(numberTasks);
     //   this.countDown = new CountDownLatch(1);
    }
    public Integer getStudentId() {
        return studentId;
    }
    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }
    public CountDownLatch getCountDownLatch() {
        return countDown;
    }
    public List<Task> getTaskList() {
        return taskList;
    }
    public void addTask(Task task) {
        taskList.add(task);
    }
    public void run() {
        int i = 0;
        for (Task inWork : taskList) {
            // на выполнение задания требуется некоторое время
            try {
                Thread.sleep(new Random().nextInt(100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // отправка ответа
            inWork.setAnswer("Answer #" + ++i);
            System.out.println("Answer #" + i + " from " + studentId);
        }
        try {
            Tutor.latch.countDown();
            countDown.await(); //  ожидание    проверки  заданий
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // подсчет средней оценки за все задачи
        float averageMark = 0;
        for (Task inWork : taskList) {
            // выполнение задания
            averageMark += inWork.getMark(); // отправка ответа
        }
        averageMark /= taskList.size();
        System.out.println("Student " + studentId + ": Average mark = "
                + averageMark);
    }
}
