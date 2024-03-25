package com.epam.array.main;

import com.epam.array.creator.CustomArrayFactory;
import com.epam.array.entity.CustomArray;
import com.epam.array.exception.CustomException;
import com.epam.array.reader.ArrayReader;
import com.epam.array.reader.impl.ArrayReaderImpl;
import com.epam.array.repository.ArrayRepository;
import com.epam.array.repository.spec.IdSpecification;
import com.epam.array.repository.spec.Specification;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;

public class ArrayMain {
    public static void main(String[] args) throws CustomException {
        ArrayReader reader = new ArrayReaderImpl();

        int[] nums = reader.readArray("data\\arrays.txt");
        System.out.println(Arrays.toString(nums));
        CustomArray array = CustomArrayFactory.createCustomArray(nums);
        System.out.println(array);
        //factory
//        ArrayRepository repository = new ArrayRepository();
//        Specification specification = new IdSpecification(4);
//        List<CustomArray> resultIdList = repository.query(specification);
//      Supplier<CustomArray> array2 = CustomArrayFactory.create(nums);
//      System.out.println(array2.get());

//    String name = UUID.randomUUID().toString();
//    System.out.println(name);
        String s = "\\b\\d+(\\.\\d+)?\\b";

    }
}
