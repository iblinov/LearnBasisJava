package by.bsu2.consumer.main;

import by.bsu2.consumer.entities.Order;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;



public class Main {
    static final Logger LOG = LogManager.getLogger();

    public static void main(String[] args) {
 //       LOG.info("hello");

        System.out.println("".isEmpty()==new String().isEmpty());

        List<Order> orders = new ArrayList<Order>() {
            {
                this.add(new Order(3245, OrderCreator.createContentOrder()));
                this.add(new Order(7811, OrderCreator.createContentOrder()));
                this.add(new Order(9800, OrderCreator.createContentOrder()));
                this.add(new Order(2001, OrderCreator.createContentOrder()));
                this.add(new Order(4010, OrderCreator.createContentOrder()));
            }
        };
//        OrderAction action = new OrderAction();
//     //   orders.forEach(action);
//        orders.forEach((o)->o.setId(o.getId()+10000));
//        System.out.println(orders);
        LOG.debug("end of ///");
        ArrayList<String> list = new ArrayList<String>() {
            {
                this.add("aaay");
                this.add("bbby");
                this.add("zzzy");
                this.add("kkkdatytytyt");
                this.add("naaya");
                this.add("cbbdajhgjhghg");
                this.add("wzzdkjjkjk");
                this.add("pkk");
                this.add("ahay");
                this.add("bkby");
                this.add("zlz");
                this.add("kykda");
                this.add("nsayahghjgjh");
                this.add("c3bdahhjhjh");
                this.add("W6zdk");
                this.add("P67kd");
            }
    };
    // list.sort(String::compareTo);
     //  Comparator<String> c =(str1,str2)->str1.length()-str2.length();
    // list.sort((str1,str2)->str1.length()-str2.length());

    // List<String> res =
   //          list.stream().filter((o)->o.length()>4).map(String::toUpperCase).sorted().forEach(System.out::println);
    //    list.stream().filter((o)->o.length()>4).map(String::toUpperCase).sorted((str2, str1)->str1.length()-str2.length()).forEach(System.out::println);
     //   System.out.println(res);

    //    IntStream.range(5, 15).forEach(System.out::println);
      //  IntStream.range(5, 15).map(x->(int)Math.pow(x, 2)).average().ifPresent(System.out::println);
     //  Stream.of("56.", "33","71", "12").map(s->s+"1").mapToDouble(Double::parseDouble).limit(3).min().ifPresent(System.out::println);
      //  IntStream.range(5, 15).mapToObj(String::valueOf).forEach(System.out::println);
      //  IntStream.range(5, 15).mapToObj(x->"A"+x%2).forEach(System.out::println);

       Stream<Optional<String>> opt = orders.stream().flatMap(o->Stream.of(o.getDescription())).filter(Optional::isPresent);
 //      orders.stream().flatMap(o->Stream.of(o.getDescription())).map(o->o.ifPresent(s -> {}));
    }
}
