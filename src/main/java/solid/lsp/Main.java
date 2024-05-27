package solid.lsp;

public class Main {
   {
    System.out.println("st");
  }
  void method(Vehicle vehicle){
    vehicle.accelerate();
  }

  public static void main(String[] args) {
    Main main = new Main();
    main.method(new Car());
    main.method(new ElectricCar());
    Main main1 = new Main();
    main1.method(new Car());
    main1.method(new ElectricCar());
  }

}
class Vehicle {
  public void startEngine() {
    System.out.println("Запуск двигателя V");
  }

  public void accelerate() {
    System.out.println("accelerate V");
  }
}

class Car extends Vehicle {
  public void startEngine() {
    // Запуск двигателя автомобиля
  }

  public void accelerate() {
    System.out.println("accelerate VC");
  }
}

class ElectricCar extends Vehicle {
  public void startEngine() {
    throw new UnsupportedOperationException("Невозможно запустить двигатель электромобиля");
  }

  public void accelerate() {
    System.out.println("accelerate EV");
  }
}