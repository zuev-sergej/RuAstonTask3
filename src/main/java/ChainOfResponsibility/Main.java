package ChainOfResponsibility;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        BuyTicket airplane = new AirplaneTicket();
        BuyTicket train = new TrainTicket();
        BuyTicket bus = new BusTicket();

        airplane.setNext(train);
        train.setNext(bus);

        String[] type = {"Поезд", "Самолет", "Автобус", "Поезд"};

        Arrays.stream(type).forEach(airplane::buy);

    }
}
