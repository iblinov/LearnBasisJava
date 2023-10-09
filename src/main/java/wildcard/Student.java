package wildcard;

import java.util.StringJoiner;

public class Student extends Person1 {
  private String name;

  public Student(int id, String name) {
    super(id);
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", super.toString() + "[", "]")
            .add("name='" + name + "'")
            .toString();
  }
}
