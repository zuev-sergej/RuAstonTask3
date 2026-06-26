package Adapter;

public class VisaCard implements VisaPayment {

    @Override
    public void payWithVisa(double amount) {
        System.out.println("Оплата через Visa: " + amount);
    }
}
