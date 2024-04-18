package com.epam.learn.edu.main;

import com.epam.learn.edu.entity.Student;
import com.epam.learn.edu.entity.StudentComparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComaratorMain {
    public static void main(String[] args) {
        List<Student> studs = new ArrayList<>();
        studs.add(new Student("joe", 7.1));
        studs.add(new Student("john", 5.1));
        studs.sort(new Student.NameComparator());
        studs.sort(StudentComparator.NAME);
        studs.sort(Comparator.comparing(Student::getName));
    }
}
