package com.epam.array.repository.spec;

import com.epam.array.entity.CustomArray;
import com.epam.array.service.ArrayService;
import com.epam.array.service.impl.ArrayServiceImpl;

public class MaxSpecification implements Specification {
    private int minRangeMax;
    private int maxRangeMax;

    public MaxSpecification(int minRangeMax, int maxRangeMax) {
        this.minRangeMax = minRangeMax;
        this.maxRangeMax = maxRangeMax;
    }

    @Override
    public boolean specify(CustomArray array) {
        ArrayService service = new ArrayServiceImpl();
        int currentMax = service.findMax(array);
        return (minRangeMax <= currentMax && currentMax <= maxRangeMax);
    }
}
