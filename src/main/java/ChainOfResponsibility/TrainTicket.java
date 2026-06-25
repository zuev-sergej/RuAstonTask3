package ChainOfResponsibility;

public class TrainTicket extends BuyTicket {
    @Override
    public void buy(String type) {
        if (type.equalsIgnoreCase("Поезд")) {
            System.out.println("Билет на поезд куплен.");
        } else if (next != null) {
            next.buy(type);
        }
    }
}