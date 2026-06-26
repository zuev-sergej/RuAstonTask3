package Adapter;

public class MirToVisaAdapter implements VisaPayment {

    private MirCard mirCard;

    public MirToVisaAdapter(MirCard mirCard) {
        this.mirCard = mirCard;
    }

    @Override
    public void payWithVisa(double amount) {

        mirCard.pay(amount);
    }
}
