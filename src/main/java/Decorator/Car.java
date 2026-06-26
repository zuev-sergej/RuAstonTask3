package Decorator;

public abstract class Car {
    String description = "Неизвестный автомобиль";

    public String getDescription() {
        return description;
    }

    public abstract int cost();
}
