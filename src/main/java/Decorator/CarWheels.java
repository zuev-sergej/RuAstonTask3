package Decorator;

public class CarWheels extends Addition {

    public CarWheels(Car car) {
        this.car = car;
    }

    @Override
    public String getDescription() {
        return car.getDescription() + ", легкосплавные литые диски";
    }

    @Override
    public int cost() {
        return car.cost() + 1600;
    }
}
