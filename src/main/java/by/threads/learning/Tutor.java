package by.bsu.learning;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Tutor extends Thread {
    private List<Student> studentList;

    public Tutor() {
        this.studentList = new LinkedList<>();
    }

    public void addStudent(Student student){
        studentList.add(student);
    }

    public void run() {
        for (Student student: studentList) {
            for (Task task : student.getTaskList()) {
                if(task.isReady()){
                    task.setMark(4 + new Random().nextInt(6));
                }
                System.out.printf("Student %d: task %d, mark %d.\n", student.getIdStudent(), task.getIdTask(), task.getMark());
                student.getCountDownLatch().countDown();
            }
            System.out.printf("All estimates are made for student %d.\n", student.getIdStudent());
        }
    }
}
