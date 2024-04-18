package optional;

import java.util.Optional;

public class ArrayService {
    public int countSum(int[] array) {
        if (array.length < 1) {
            //
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public Optional<Integer> countSumOptional(int[] array) {
        Optional<Integer> sumOptional = Optional.empty();
        if (array.length > 0) {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            sumOptional = Optional.of(sum);
        }
        return sumOptional;
    }
}
