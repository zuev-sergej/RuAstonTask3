package Builder;

public class Main {

    public static void main(String[] args) {

        User user1 = new User.Builder("Иван", "123weer55", "ivan@mail.ru")
                .age(23)
                .build();

        System.out.println(user1);
    }
}
