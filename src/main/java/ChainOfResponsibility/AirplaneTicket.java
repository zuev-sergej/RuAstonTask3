package ChainOfResponsibility;

public class AirplaneTicket extends BuyTicket {
    @Override
    public void buy(String type) {
        if (type.equalsIgnoreCase("Самолет")) {
            System.out.println("Билет на самолет куплен.");
        } else if (next != null) {
            next.buy(type);
        }
    }
}
