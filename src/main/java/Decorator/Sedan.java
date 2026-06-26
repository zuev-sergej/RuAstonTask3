package Decorator;

public class Sedan extends Car {
    public Sedan() {
        description = "Седан";
    }

    @Override
    public int cost() {
        return 20000;
    }
}
