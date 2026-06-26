package Decorator;

public class Suv extends Car {

    public Suv() {
        description = "Внедорожник";
    }

    @Override
    public int cost() {
        return 30000;
    }
}
