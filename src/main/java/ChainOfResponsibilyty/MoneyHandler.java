package ChainOfResponsibilyty;

public abstract class MoneyHandler {

    protected MoneyHandler next;

    public void setNext(MoneyHandler next) {
        this.next = next;
    }

    public abstract void handle(int amount);
}
