package com.epam.inheritance;

import com.epam.array.entity.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.*;

import java.util.*;
import java.util.stream.Stream;

class Q1 {
  public static void main(String args[]) {
    Person p1 = new Person(9, "xa");
    Person p2 = new Person(5, "cd");
    Person p3 = new Person(7, "aa");
    Person p4 = new Person(7, "yui");
    Person p5 = new Person(59, "fed");
    List<Person> list = List.of(p1,p2,p3,p4,p5);
    IntSummaryStatistics statistics = list.stream()
            .filter(p -> p.getName().length() <= 2)
            .mapToInt(p -> p.getPersonId())
            .summaryStatistics();
    statistics.accept(100);
    System.out.println(statistics.getSum());
    System.out.println(statistics.getMax());
    System.out.println(statistics.getMin());
    System.out.println(statistics.getAverage());
    System.out.println(statistics.getCount());
    Object o1 = new Object();
    Object o2 = new Object();
    Object o3 = o1;
    System.out.println(o1.equals(o3) + " " + o3.equals(o2) + " " + o2.equals(o1));
   // System.out.println(summa);
  }
}

public class Studmain {
  public static void main(String[] args) {
    Thread t = new Thread();

    //  Student student = new Student();
    // Student.Address address = new Student.Address();
    Point3D point3D = new Point3D(5, 3, 6, 9) {
      @Override
      public double distance() {
        m();
        return 1;
      }

      public void m() {
      }
    };
    Point3D point = new Point3D(2, 3, 6, 7);
    Point3D point1 = new Point3D(2, 3, 6, 5);
    Point3D point2 = new Point3D(2, 3, 7, 5);
    Point3D point3 = new Point3D(2, 3, 7, 12);
    Point3D point4 = new Point3D(2, 3, 7, 1);

    List<Point3D> list = new ArrayList<>();
    list.add(point);
    list.add(point3D);
    list.add(point2);
    list.add(point4);
    list.add(point3);
    list.add(point1);
    list.add(null);
    System.out.println(list);

    Comparator<Point3D> comparatorZ = (o1, o2) -> o1.getZ() - o2.getZ();

    // list.sort((o2, o1) -> o1.getZ() - o2.getZ());
    list.sort(Comparator.nullsFirst(
            Comparator.comparing(Point3D::getY)
                    .thenComparing(Point3D::getZ)));
    System.out.println(list);
  }
}
