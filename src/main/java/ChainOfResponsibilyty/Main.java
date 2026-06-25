package ChainOfResponsibilyty;

public class Main {

    public static void main(String[] args) {

        MoneyHandler thousand = new ThousandHandler();
        MoneyHandler fiveHundred = new FiveHundredHandler();
        MoneyHandler hundred = new HundredHandler();

        thousand.setNext(fiveHundred);
        fiveHundred.setNext(hundred);

        thousand.handle(4800);
    }
}
