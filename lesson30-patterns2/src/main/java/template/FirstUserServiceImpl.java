package template;

public class FirstUserServiceImpl extends UserService {
    @Override
    public void validate(User user) {
        if (user.getName() == null || user.getName().length() < 5) {
            throw new IllegalArgumentException("Name is too short");
        }

        if (user.getAge() < 30) {
            throw new IllegalArgumentException("Age is too young");
        }
    }

    @Override
    public void notyfyUser(User user) {
        System.out.println("Send to telegram");
    }
}
