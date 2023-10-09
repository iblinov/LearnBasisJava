package main;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main1 {
  public static void main(String[] args) {
//    IntStream s = IntStream.of(100);	//line1
//    Stream i = s.boxed();				//line2
//    DoubleStream y = s.mapToDouble(x -> x); //line3
//    Stream q = y.mapToInt(x -> x);		//line4
//    q.forEach(System.out::print);		//line5
//    DateFormat df = DateFormat.getInstance();
//    Date d1 = new Date();
//    Locale loc = Locale.getDefault();
//    System.out.println(loc.getDisplayCountry()
//            + " " + df.format(d1));

        List<String> lst1 = new ArrayList<String>();
        List<Integer> lst2 = new ArrayList<Integer>();
        List<List<Integer>> lst3 = new ArrayList<List<Integer>>();
        System.out.print(lst1.getClass().getName() + " ");
        System.out.print(lst2.getClass() + " ");
        System.out.println(lst3.getClass());



  }
}
