package ChainOfResponsibilyty;

public class FiveHundredHandler extends MoneyHandler {

    @Override
    public void handle(int amount) {

        int count = amount / 500;

        if (count > 0) {
            System.out.println("Выдать " + count + " купюр по 500");
        }

        int remainder = amount % 500;

        if (remainder > 0 && next != null) {
            next.handle(remainder);
        }
    }
}
