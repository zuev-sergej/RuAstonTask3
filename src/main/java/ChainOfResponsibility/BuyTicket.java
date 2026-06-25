package ChainOfResponsibility;

public abstract class BuyTicket {
    protected BuyTicket next;

    public void setNext(BuyTicket next) {
        this.next = next;
    }

    public abstract void buy(String type);

}
