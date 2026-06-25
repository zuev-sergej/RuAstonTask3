package Proxy;

public class RealDocument implements Document {
    @Override
    public void view() {
        System.out.println("Просмотр документа");
    }
}
