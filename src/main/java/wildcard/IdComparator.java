package wildcard;

import java.util.Comparator;

public class IdComparator implements Comparator<Person1> {
  @Override
  public int compare(Person1 o1, Person1 o2) {
    return o1.getId() - o2.getId();
  }
}
