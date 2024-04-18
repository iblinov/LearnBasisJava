package com.epam.array.observer.impl;

import com.epam.array.entity.*;
import com.epam.array.observer.ArrayStatisticsObserverE;

public class ArrayStatisticsObserverEImpl implements ArrayStatisticsObserverE {
    @Override
    public void changeArrayElement(ArrayEvent event) {
        CustomArrayE array = event.getSource();
        ArrayStatistics statistics = new ArrayStatistics(array);
        int id = array.getArrayId();
        Warehouse warehouse = Warehouse.getInstance();
        warehouse.put(id, statistics);
    }
}
