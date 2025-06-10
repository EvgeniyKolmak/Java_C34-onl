package template;

public class MainApp {

    public static void main(String[] args) {

        User user = new User("Johnsad", 40, "telegram");

        UserService userService = new FirstUserServiceImpl();

        userService.register(user);


    }

}
