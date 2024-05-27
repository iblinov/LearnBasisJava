package by.bsu2.generic;

import java.util.ArrayList;
import java.util.List;

public class InctanceOfMain {
  public static void main(String[] args) {
//    List<String> list1 = new ArrayList<>();
//    list1.add("uuu");
    List<String> list1 = List.of("88");
    List<Integer> list2 = List.of(1, 3);
    if(list1 instanceof ArrayList list) System.out.println(list + "true1");
    if(list1 instanceof ArrayList<String> list) System.out.println(list + "true0");
    if(list2 instanceof List) System.out.println("true2");
    if(list2 instanceof List<?>) System.out.println("true3");
    if(list2 instanceof List<? extends Number>) System.out.println("true4");
    if(list2 instanceof List<? super Integer>) System.out.println("true5");
  }
}
