package stream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Stream1 {
  IntStream method() {
    int[] arr = {5, 2, 7, 1, 9, 3, 3, 1, -4};
    final int num = 10;
    // ++num;
    return Arrays.stream(arr)
            .filter(n -> n > 0)
            .distinct()
            .map(n -> n + num)
            .sorted()
            .limit(3);
  }
  public static void main(String[] args) {
    //1
    int[] arr = {5, 2, 7, 1, 9, 3, 3, 1, -4};
    final int num = 10;
   // ++num;
    int[] res = Arrays.stream(arr)
            .filter(n -> n > 0)
            .distinct()
            .map(n -> n + num)
            .sorted()
            .limit(3)
            .toArray();
    //++num;
    System.out.println(Arrays.toString(res));
    //2
    // arr = new int[]{5, 2, 7, 1, 9, 3, 3, 1};
    arr = new int[]{};
    OptionalInt opt = Arrays.stream(arr)
            .max();
    if (opt.isPresent()) {
      System.out.println(opt.getAsInt());
    } else {
      System.out.println(" no result");
    }
    //3
    arr = new int[]{5, 2, 7, 1, 9, 3, 3, 1};
    //arr = new int[]{};
    IntSummaryStatistics stat = Arrays.stream(arr)
            .summaryStatistics();
    stat.getMax();
    stat.getSum();
    //4
    int[] arr1 = {5, 2, 3};
    int sum = 1;
    sum--;
    int r = Arrays.stream(arr1)
            //.reduce(1, (n1, n2) -> n1 * n2);
            .reduce(sum, (n1, n2) -> n1 + n2);
    System.out.println(r);
    //4
    arr = new int[]{56, 2, 7477777, 21000, 9, 33, 33, 1, 0, 3};
    Arrays.stream(arr)
            .flatMap(i -> Arrays.stream(String.valueOf(i).split("")).mapToInt(Integer::parseInt))
            .forEach(System.out::println);

    //5
    String strs[] = {"bbb", "ttt", "yyy"};
//    Arrays.stream(strs)
//            .mapMulti((s, consumer) -> (Consumer<String>)(s1 -> s1.toUpperCase()))
//            .forEach(System.out::println);
  }
}
