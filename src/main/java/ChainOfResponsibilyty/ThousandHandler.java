package ChainOfResponsibilyty;

public class ThousandHandler extends MoneyHandler {

    @Override
    public void handle(int amount) {

        int count = amount / 1000;

        if (count > 0) {
            System.out.println("Выдать " + count + " купюр по 1000");
        }

        int remainder = amount % 1000;

        if (remainder > 0 && next != null) {
            next.handle(remainder);
        }
    }
}
