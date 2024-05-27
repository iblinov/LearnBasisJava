package by;
public enum Shape {
    RECTANGLE(new ReangleAction()), TRIANGLE(new SqareAction()), CIRCLE(new CircleAction());
    // метод класса перечисления
    private Action action;
    Shape(Action action) {
        this.action = action;
    }
    public double defineSquare(double ... x) {
        // проверка параметров
       return action.define(x);
    }
}
enum WrongPlanType {
    AIRBUS_A320, AIRBUS_A380, AIRBUS_A330, BOEING_737_800, BOEING_777
}
class WrongPlane {
    private WrongPlanType type;
}
class Plane {
  //  private PlanType type;
    private String model;
}
