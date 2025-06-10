package template;

public class SecondUserServiceImpl extends UserService {
    @Override
    public void validate(User user) {
        if (user.getName() == null) {
            throw new IllegalArgumentException("Name is null");
        }

        if (user.getAge() < 18) {
            throw new IllegalArgumentException("Age is too young");
        }
    }

    @Override
    public void notyfyUser(User user) {
        System.out.println("Send email");
    }
}
