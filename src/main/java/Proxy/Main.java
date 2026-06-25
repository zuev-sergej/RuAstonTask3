package Proxy;

public class Main {
    public static void main(String[] args) {
        Document admin = new DocumentProxy("admin");
        admin.view();

        Document user = new DocumentProxy("user");
        user.view();
    }
}
