package by.bsu2.collect.list;
import by.streamprj.entity.Order;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
class Student{
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (id != student.id) return false;
        return name.equals(student.name);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + name.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
public class DemoGeneric {
    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<>();
         //ArrayList<int> b = new ArrayList<int>(); // ошибка компиляции
        list.add("JavaZ"); // компилятор "знает" допустимый тип передаваемого значения
        list.add("JavaFX2");
        list.add("Java2");
        list.add("JavaX2");

      //  list.forEach(o1 -> System.out.println(o1.toUpperCase()));
        //list.removeIf(o -> o.length() > 5);
        list.sort((o1,o2) -> o1.compareTo(o2));
 //       System.out.println(list);
        String res = list.get(0); /* компилятор "знает" допустимый тип возвращаемого значения */
   //       list.add(new StringBuilder("C#")); // ошибка компиляции
//        // компилятор не позволит добавить "посторонний" тип
//        System.out.println(list); // удобный вывод
//        ArrayList<Order> orders = new ArrayList<Order>() {
//            {
//                add(new Order(231, 12.f));
//                add(new Order(389, 2.9f));
//                add(new Order(217, 1.7f));
//                // add(new Item(23154, 120.f, "Xerox"));
//                // ошибка компиляции: список параметризован
//            }
//        };
//        orders.forEach(o1 -> o1.setAmount(o1.getAmount()*0.9f));
//        System.out.println(orders);
//        orders.removeIf(o1 -> o1.getAmount() < 10f);
//        System.out.println(orders);
//        long res1 = orders.stream().filter(o1 -> o1.getAmount() < 10f).count();
        Queue<String> q = new LinkedList<>();
        TreeSet<Student> set = new TreeSet<Student>((o1,o2)->o1.getName().compareTo(o2.getName())){
            {
                this.add(new Student(2, "petya"));
                this.add(new Student(2, "vasja"));
                this.add(new Student(-1, "oleg"));
                this.add(new Student(0, "dima"));
                this.add(new Student(-3, "vlad"));


            }
        };
     //   System.out.println(set);


    }
}
