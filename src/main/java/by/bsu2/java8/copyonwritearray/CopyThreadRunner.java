package by.bsu2.java8.copyonwritearray;
import java.util.*;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class CopyThreadRunner {
    public static void main(String[] args) {
        // заполнение коллекции 20-ью случайными числами в диапазоне от 10 до 50
        List<Integer> temp =
                new Random().ints(20, 10, 50).boxed().collect(Collectors.toList());
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<Integer>(temp);
        // List<Integer> list = temp; // этот список будет генерировать bcrk.xtybt
        new Thread(() -> {
            Iterator<Integer> iterator = list.iterator();
            while (iterator.hasNext()) {
                System.out.print(iterator.next() + " ");
                try {
                    TimeUnit.MILLISECONDS.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    TimeUnit.MILLISECONDS.sleep(10);// change to 100
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                list.add(i);

            }
        }).start();
        try {
            TimeUnit.MILLISECONDS.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(list);
    }
}
