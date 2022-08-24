package lambdaInterOpKotlinVsJava.kotlin.asjava;

public class App {

    public static void main(String[] args) {
        User user = new User("Java- user");
        user.create(new Created() {
            @Override
            public void onCreate(User user) {
                System.out.println("Hi from Java user: " + user);
            }
        });
    }
}
