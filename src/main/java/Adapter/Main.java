package Adapter;

public class Main {
    public static void main(String[] args) {

        MirCard mirCard = new MirCard();

        VisaPayment adapter = new MirToVisaAdapter(mirCard);

        OnlineStore store = new OnlineStore(adapter);

        store.checkout(3500);
    }
}
