package wildcard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.UnaryOperator;

public class Main <K extends Thread & List<K>> {
  K k;
  public Main(K k) {
    this.k = k;
  }

  public static void main(String[] args) {

    List<Student> students = new ArrayList<>();
    students.add(new Student(3, "C"));
    students.add(new Student(1, "X"));
    students.add(new Student(2, "P"));
    Collections.sort(students, new IdComparator());
    System.out.println(students);
//    List<Person> persons = List.of(
//            new Person(5, "jack"),
//            new Person(7, "john"),
//            new Person(3, "kurt"),
//            new Person(1, "arnold"));
//    UnaryOperator<Integer> consumer = i -> i > 3 ? ++i : --i;
//    for (Person person : persons) {
//      System.out.print(consumer.apply(person.id()) + " ");
//    }
  }
}
record Person(int id, String name) {
}
