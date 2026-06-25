package Builder;

public class User {

    private String name;
    private String password;
    private String email;
    private String lastName;
    private int age;

    public User(Builder builder) {

        this.name = builder.name;
        this.password = builder.password;
        this.email = builder.email;
        this.lastName = builder.lastName;
        this.age = builder.age;
    }

    @Override
    public String toString() {

        return "Пользователь " + "имя: " + name +
                ", пароль: " + password +
                ", email: " + email +
                ", фамилия: " + lastName +
                ", возраст " + age;
    }

    public static class Builder {

        // обязательные поля
        private String name;
        private String password;
        private String email;

        // необязательные поля
        private String lastName = "Не указана";
        private int age;

        public Builder(String name, String password, String email) {
            this.name = name;
            this.password = password;
            this.email = email;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public User build() {
            User user = null;
            if (validate()) {
                user = new User(this);
            } else {
                System.out.println("Ошибка, поля \"name\", \"password\", \"email\" не могут быть пустыми.");
            }
            return user;
        }

        private boolean validate() {
            return (name != null && !name.trim().isEmpty() && email != null && !email.trim().isEmpty() && password != null && !password.isEmpty());
        }
    }
}