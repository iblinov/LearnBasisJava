package com.epam.learn.optional;


import java.util.Optional;

public class IntService {
    public double average(int[] array) {
        double sum = 0;
        for (int element : array) {
            sum += element;
        }
        return sum / array.length;
    }

    public Optional<Double> averageOpt(int[] array) {
        Optional<Double> result;
        if(array != null && array.length > 0) {
            double avg = average(array);
            result = Optional.of(avg);
        } else {
            result = Optional.empty();
        }
        return result;
    }
}
