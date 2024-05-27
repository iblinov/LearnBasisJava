package by.bsu2.consumer_predicate.main;

import by.bsu2.consumer_predicate.entities.Dean;
import by.bsu2.consumer_predicate.entities.Student;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("Ivan", "Petrov", generateMapMark()));
        students.add(new Student("Petr", "Ivanov", generateMapMark()));
        students.add(new Student("Maria", "Kulokova", generateMapMark()));
        Dean dean = new Dean();
        for (Student student : students) {
            dean.expelled(student, student_ -> student_.isBadMark(), student_ -> student_.expelledStudent());
        }
    }

    public static Map<String, Integer> generateMapMark() {
        Map<String, Integer> map = new HashMap<String, Integer>();
        Random random = new Random();
        map.put("Algebra", random.nextInt(10));
        map.put("Geometria", random.nextInt(10));
        map.put("Matan", random.nextInt(10));
        return map;
    }

}
