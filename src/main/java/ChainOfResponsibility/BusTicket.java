package ChainOfResponsibility;

public class BusTicket extends BuyTicket {
    @Override
    public void buy(String type) {
        if (type.equalsIgnoreCase("Автобус")) {
            System.out.println("Билет на автобус куплен.");
        } else if (next != null) {
            next.buy(type);
        }
    }
}
