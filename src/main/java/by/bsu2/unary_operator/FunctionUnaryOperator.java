package by.bsu2.unary_operator;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;


public class FunctionUnaryOperator<T> {

    public List<T> applyFunction(UnaryOperator<T> unaryOperator, List<T> list) {
        List<T> returnedList = new ArrayList<T>();
        list.forEach(x -> returnedList.add(unaryOperator.apply(x)));
        return returnedList;
    }

    public List<T> applyFunctionAndThen(UnaryOperator<T> unaryOperator, UnaryOperator<T> unaryOperatorThen, List<T> list) {
        List<T> returnedList = new ArrayList<T>();
        list.forEach(x -> returnedList.add(unaryOperator.andThen(unaryOperatorThen).apply(x)));
        return returnedList;
    }

    public List<T> applyFunctionCompose(UnaryOperator<T> unaryOperator, UnaryOperator<T> unaryOperatorCompose, List<T> list) {
        List<T> returnedList = new ArrayList<T>();
        list.forEach(x -> returnedList.add(unaryOperator.compose(unaryOperatorCompose).apply(x)));
        return returnedList;
    }

}
