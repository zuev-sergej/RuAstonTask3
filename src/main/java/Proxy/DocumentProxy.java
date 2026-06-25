package Proxy;

public class DocumentProxy implements Document {
    private RealDocument document;
    private String role;

    public DocumentProxy(String role) {
        this.document = new RealDocument();
        this.role = role;
    }

    @Override
    public void view() {
        if ("admin".equals(role)) {
            document.view();
        } else {
            System.out.println("Доступ запрещен");
        }
    }
}
