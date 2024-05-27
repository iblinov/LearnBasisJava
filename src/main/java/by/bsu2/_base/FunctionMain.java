package by.bsu2._base;

import java.util.*;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class FunctionMain {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<Integer>(){{
      this.add(17);
      this.add(72);
      this.add(77);
      this.add(27);
      this.add(47);
      this.add(null);
      this.add(97);
    }};
    IntStream intStream = list.stream().filter(Objects::nonNull).filter(o-> o < 50).mapToInt(o-> o + 100);
    System.out.println(Arrays.toString(intStream.toArray()));
    System.out.println(list);
//    IntStream i1 = new Random().ints(10, 10, 20);
//    IntSummaryStatistics stat=  i1.summaryStatistics();

   // System.out.println(Arrays.toString(i1.toArray()));
  // intStream.sum();
    //intStream.count();

   ///  long c = list.stream().count();

  //  DoubleStream streamDouble = DoubleStream.of(5.6, 8.7, 9.0, 3.6, 2.7,6.1);
  }
}
