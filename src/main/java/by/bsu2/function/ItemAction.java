package by.bsu2.function;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class ItemAction {
    public void example() {
        List<String> names = Arrays.asList( "John", "Frank", "Sam");
      //  List<Item> users = map(names, Item::new);
    }
    public <R, T> List<T> map(List<R> list, Function<R, T> function) {
        List<T> result = new ArrayList<T>(list.size());
        list.forEach(o -> result.add(function.apply(o)));
        return result;
    }
}
