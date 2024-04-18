package com.epam.array.entity;

import java.util.Arrays;
import java.util.StringJoiner;

public class CustomArrayProtect {

    private int[] customArray;

    public CustomArrayProtect(int... customArray) {
        this.customArray = Arrays.copyOf(customArray, customArray.length);
    }

    public int[] getCustomArray() {
        return Arrays.copyOf(customArray, customArray.length);
    }

    public void setCustomArray(int[] customArray) {
       // this.customArray = customArray;
        this.customArray = Arrays.copyOf(customArray, customArray.length);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", CustomArrayProtect.class.getSimpleName() + "[", "]")
                .add("customArray=" + Arrays.toString(customArray))
                .toString();
    }
}
