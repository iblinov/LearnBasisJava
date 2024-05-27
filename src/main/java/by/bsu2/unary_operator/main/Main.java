package by.bsu2.unary_operator.main;


import by.bsu2.unary_operator.FunctionUnaryOperator;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> listInteger = Arrays.asList(1, 2, 3, 4, 5, 6);
        FunctionUnaryOperator<Integer> integerUnaryOperator = new FunctionUnaryOperator<Integer>();
        System.out.println("Unary operator for squaring integer: " + integerUnaryOperator.applyFunction(x -> x * x, listInteger));
        System.out.println("Unary operator for performing two function (squaring and multiply it by 42): "
                + integerUnaryOperator.applyFunctionAndThen(x -> x * x, x -> x * 42, listInteger));
        System.out.println("Unary operator for performing composition uf two function (sum of squares)"
                + integerUnaryOperator.applyFunctionCompose(x -> x + x, x -> x * x, listInteger));
    }

}
