package Decorator;

public class CarAlarm extends Addition {

    public CarAlarm(Car car) {
        this.car = car;
    }

    @Override
    public String getDescription() {
        return car.getDescription() + ", автомобильная сигнализация";
    }

    @Override
    public int cost() {
        return car.cost() + 400;
    }
}
