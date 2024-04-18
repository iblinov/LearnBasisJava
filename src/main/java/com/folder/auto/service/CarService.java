package com.folder.auto.service;

import com.folder.auto.entity.Autopark;
import com.folder.auto.entity.Car;

public class CarService {
  public Car[] findCarsByBrand(Car[] cars, String mark) {
    Car[] carsByBrand = new Car[cars.length];
    int count = 0;
    for (Car car : cars) {
      if (mark.equals(car.getMark())) {
        carsByBrand[count] = car;
        count++;
      }
    }
    return carsByBrand;
  }
  public Car[] findCarsByBrand(Autopark autopark, String mark) {
    Car[] carsByBrand = findCarsByBrand(autopark.getCars(), mark);
    return carsByBrand;
  }
}

