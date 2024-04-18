package course3;

import java.util.Arrays;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class Stream2 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 7, 1, 9, 3, 3, 1, -4};
        IntPredicate predicate = new IntPredicate() {
            @Override
            public boolean test(int value) {
                return value > 5;
            }
        };
        IntPredicate predicate1 =(int value) -> {
                return value > 5;
        };
        IntPredicate predicate2 = (int value) -> value > 5;

        IntPredicate predicate3 = value -> value > 5;
        int [] res = Arrays.stream(arr)
            //    .filter(((IntPredicate) n -> n > 5).negate())
                .filter(predicate.negate())
//                .filter((int value) -> {
//                    return value > 5;
//                })
                .toArray();
        System.out.println(Arrays.toString(res));
    }
}
