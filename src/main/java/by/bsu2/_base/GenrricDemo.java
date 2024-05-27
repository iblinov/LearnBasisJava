package by.bsu2._base;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Human {
  private long humanId;

  public Human(long humanId) {
    this.humanId = humanId;
  }

  public long getHumanId() {
    return humanId;
  }

  public void setHumanId(long humanId) {
    this.humanId = humanId;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("{");
    sb.append("humanId=").append(humanId);
    sb.append('}');
    return sb.toString();
  }
}
class Student extends Human {
  private String name;

  public Student(long humanId, String name) {
    super(humanId);
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public Student setName(String name) {
    this.name = name;
    return this;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder(super.toString());
    sb.append("name='").append(name).append('\'');
    sb.append('}');
    return sb.toString();
  }
}
public class GenrricDemo {
  static Predicate<Student> lengthTest(int length) {
    return o -> o.getName().length() < length;
  }
  public static void main(String... args) {
    ArrayList<Student> list = new ArrayList<>(){
      {
        this.add(new Student(75, "Volynec"));
        this.add(new Student(66, "Kaptiyg"));
        this.add(new Student(88, "Azhevsky"));
        this.add(new Student(11, "Bogdan"));
      }
    };

//    Comparator<Human> comparator = (o1, o2)->
//         Long.compare(o1.getHumanId(), o2.getHumanId());
list.add(3, new Student(53, "Alexeichik"));
List<Student> listSt = new ArrayList<>();
list.stream().limit(3).filter(o -> o.getHumanId() > 50).map(o -> o.setName(o.getName().toUpperCase())).forEach(o -> listSt.add(o));//forEach(listSt::add);
listSt.forEach(System.out::println);
    System.out.println(list);
    Predicate<Student> predicate = o -> o.getName().length() < 7;
  list.removeIf(lengthTest(7).or(s -> s.getName().length() > 7));
 // list.removeIf(o -> o.getName().length() <= 7);
    Consumer<Student> consumer =  o -> o.setName(o.getName().toUpperCase());
    list.forEach(consumer.andThen(o-> o.setHumanId(o.getHumanId() + 200)));
//list.forEach(System.out::println);
list.replaceAll( o -> new Student(1, "a"));
//    list.sort((o1, o2)->Long.compare(o1.getHumanId(), o2.getHumanId()));
//    list.sort(Comparator.comparing(Student::getHumanId));
 //   System.out.println(list);
  }
}
