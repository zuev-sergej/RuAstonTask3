package ChainOfResponsibilyty;

public class HundredHandler extends MoneyHandler {

    @Override
    public void handle(int amount) {

        int count = amount / 100;

        if (count > 0) {
            System.out.println("Выдать " + count + " купюр по 100");
        }

        int remainder = amount % 100;

        if (remainder > 0) {
            System.out.println("Невозможно выдать остаток: " + remainder);
        }
    }
}
