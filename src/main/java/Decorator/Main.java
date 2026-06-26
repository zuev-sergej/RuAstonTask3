package Decorator;

public class Main {
    public static void main(String[] args) {

        Car car = new Sedan();

        System.out.println(car.getDescription() + " $" + car.cost());

        Car car2 = new Suv();
        car2 = new CarWheels(car2);
        car2 = new CarAlarm(car2);

        System.out.println(car2.getDescription() + " $" + car2.cost());
    }
}
