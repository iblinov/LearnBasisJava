package by.bsu.learning;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Student extends Thread {
    private long idStudent;
    private List<Task> taskList;
    private CountDownLatch countDownLatch;

    public Student(long idStudent, int numberTasks) {
        this.idStudent = idStudent;
        this.countDownLatch = new CountDownLatch(numberTasks);
        this.taskList = new LinkedList<>();
        formTaskList(numberTasks);
    }

    private void formTaskList(int numberTasks){
        for(int i = 1; i <= numberTasks; i++){
            taskList.add(new Task(i));
        }
    }

    public long getIdStudent() {
        return idStudent;
    }

    public CountDownLatch getCountDownLatch() {
        return countDownLatch;
    }

    public List<Task> getTaskList() {
        return taskList;
    }

    public void run() {
        try{
            for(Task task: taskList){
                TimeUnit.SECONDS.sleep(new Random().nextInt(2));
                task.setReady(true);
                System.out.printf("Student %d is ready with task %d.\n", idStudent, task.getIdTask());
            }
            System.out.printf("Student %d is ready with all tasks.\n", idStudent);
            countDownLatch.await(); // ожидание проверки заданий
            System.out.printf("Student %d has average mark %f.\n", idStudent, countAverageMark());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private float countAverageMark(){
        float averageMark = 0;
        for (Task task : taskList) {
            averageMark += task.getMark();
        }
        return averageMark/taskList.size();
    }
}
