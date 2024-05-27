package com.optionexample.main;





import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Optional;

public class Main {
    static Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        logger.log(Level.INFO, "this first log");

//        CarQueue carQueue = new CarQueue();
//        carQueue.putCar(new Car("BMW", "X3", 5, 200));
//        carQueue.putCar(new Car("Audi", "Quattro", 2, 400));
//
//        Optional<Car> firstCarOptional = carQueue.takeCar();
//        Optional<Car> secondCarOptional = carQueue.takeCar();
//        Optional<Car> thirdCarOptional = carQueue.takeCar();
//
//        if (firstCarOptional.isPresent()) {
//            System.out.println(firstCarOptional.get());   // true
//        }
//        secondCarOptional.ifPresent(car -> System.out.println(car));
//        thirdCarOptional.ifPresent(System.out::println);   // false
//
//        Optional<Car> changedCar = firstCarOptional
//                .filter(car -> "BMW".equals(car.getCarBrand()))
//                .map(car -> {
//                    car.setModel("X4");
//                    return car;
//                })  // return Car type variable
//                .flatMap(car -> {
//                    car.setCarBrand("Toyota");
//                    return Optional.of(car);
//                });
//        if (changedCar.isPresent()) {
//            System.out.println(changedCar.get());
//        }
//
//        Car firstCar = firstCarOptional.get();
//        Car secondCar = secondCarOptional.get();
//        //Car thirdCar = thirdCarOptional.get(); // rises an exception
//        Car thirdCar = thirdCarOptional.orElse(new Car("Empty", "Empty", 0, 0));
//
//        System.out.println(firstCar);
//        System.out.println(secondCar);
//        System.out.println(thirdCar);


    }
}
