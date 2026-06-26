package Adapter;

public class OnlineStore {
    private VisaPayment payment;

    public OnlineStore(VisaPayment payment) {
        this.payment = payment;
    }

    public void checkout(double amount) {
        System.out.println("Оформление заказа...");
        payment.payWithVisa(amount);
    }
}
