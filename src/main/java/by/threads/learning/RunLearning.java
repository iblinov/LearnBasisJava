package by.bsu.learning;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class RunLearning {
    public static void main(String[] args) throws InterruptedException {
        int studentCount = 3;
        Tutor tutor = new Tutor();
        for(int i = 1; i <= studentCount; i++){
            int taskCount = new Random().nextInt(3) + 2;
            Student student = new Student(i, taskCount);
            System.out.printf("Student %d has %d tasks.\n", i, taskCount);
            student.start();
            tutor.addStudent(student);
        }
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Time for tasks is over.");
        tutor.start();
    }
}