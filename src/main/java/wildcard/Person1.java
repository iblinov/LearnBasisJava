package wildcard;

import java.util.StringJoiner;

public class Person1 {
  private int id;

  public Person1(int id) {
    this.id = id;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", "[", "]")
            .add("id=" + id)
            .toString();
  }
}
