package stream;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListWithNullMain {
  public static void main(String[] args) {
    List<String> stringArrayList = new ArrayList<>();
    stringArrayList.add("aa");
//    stringArrayList.add(null);
    stringArrayList.add("gg");
  //  stringArrayList.add(null);
    stringArrayList.add("cc");
    stringArrayList.sort(String::compareTo);
    System.out.println(stringArrayList);

    List<String> strs = new LinkedList<>();
    strs.add("aa1");
    //strs.add(null);
    strs.add("gg1");
    //strs.add(null);
    strs.add("cc1");
    strs.sort(String::compareTo);
    System.out.println(strs);
//    stringArrayList.stream()
//            .sorted(Comparator.nullsFirst(String::compareTo))
//            .forEach(System.out::println);

  }
}
