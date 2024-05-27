package by.bsu2.java8.functional.interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateMain {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>() {
            {
                this.add("gloves");
                this.add("jersey");
                this.add("dress");
                this.add("T-shirt");
                this.add("jeans");
                this.add("top");
            }
        };
        //     list.stream().filter(s -> s.length() > 5).forEach(System.out::println);
        //     List<String> res =list.stream().filter(s -> s.length() > 5).collect(Collectors.toList());
        Predicate<String> predicate = s -> s.length() > 4;
        list.stream().filter(predicate.and(s1 -> s1.length() < 7)).forEach(System.out::println);
        list.stream().filter(Predicate.isEqual("dress").negate()).forEach(System.out::println);
        // # 1
        Predicate<String> pr = s -> s.matches("\\p{Upper}\\p{Lower}+");
        boolean r1 = pr.test("Java");
        System.out.println(r1);
        // #2
        boolean r2 = pr.negate().test("Java");
        System.out.println(r2);
        // #3 or
        Predicate<String> pr1 = s -> s.length() > 4;
        System.out.println("OR");
        System.out.println(pr.or(pr1).test("1234"));
        System.out.println(pr.or(pr1).test("12345"));
        System.out.println(pr.or(pr1).test("Javas"));

        // #4
        System.out.println("AND");
        System.out.println(pr.and(pr1).test("123"));
        System.out.println(pr.and(pr1).test("1234"));
        System.out.println(pr.and(pr1).test("12"));
        // #5
        System.out.println("isEqual");
        Predicate<String> pr4 = Predicate.isEqual("123");

        System.out.println(pr4.test("123"));
        System.out.println(pr4.test("124"));
        System.out.println(pr4.test(null));

        Predicate<String> pr3 = String::isEmpty;
        System.out.println(pr.or(pr1).and(pr3).test("12"));

//        Function<String, Predicate<String>> startsWithLetter =
//                (String letter) -> {
//                    Predicate<String> checkStartsWith =
//                            (String name) -> name.startsWith(letter);
//                    return checkStartsWith;
//                };

         Function<String, Predicate<String>> startsWithLetter =
                letter -> name -> name.startsWith(letter);

         Function<String, List<Object>> stringToChars =
                 string -> Arrays.asList(string.toCharArray());

        long res= list.stream().filter(startsWithLetter.apply("d")).count();
        System.out.println(res);
    }
}

