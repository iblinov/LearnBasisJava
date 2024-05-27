package by.bsu2.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class RunnerMain {

    public static void main(String[] args) {
        Optional<String> optional1 = Optional.of("Java");
        Optional<String> optional2 = Optional.ofNullable("Java8");
        Optional<String> optional3 = Optional.ofNullable(null);
        Optional<String> optional4 = Optional.empty();
     //   Optional<String> optional5 = Optional.of(null);
  /// 1
        if (optional1.isPresent()) {
            String ob = optional1.get();
       //     System.out.println(ob);
        } else {
            throw new IllegalArgumentException();
        }
        /// 2
        String ob1 =  optional2.orElseThrow(IllegalArgumentException::new);
     //   System.out.println(ob1);
        String ob3 = optional2.orElse("Scala");
    //    System.out.println(ob3);
        Optional<String> ob4 = optional2.or(()-> Optional.of("C++"));
     //   System.out.println(ob4);
        List<String> list = new ArrayList<>();
        optional2.ifPresent(list::add);

        System.out.println(list);
        Optional<String> ob5 = optional1.filter(o -> o.length() < 5);
      //  ob5 = optional1.filter(o -> o.length() > 5);
      //  ob5 = optional1.filter(String::isBlank);

        System.out.println(ob5.get());

        String s = " ";
        System.out.println(s.isBlank());

    }
}
