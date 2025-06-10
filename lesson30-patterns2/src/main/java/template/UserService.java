package template;

public abstract class UserService {

    public void register(User user) {
        System.out.println("Found new user " + user);

        validate(user);

        System.out.println("Save to database");

        notyfyUser(user);

    }

    public abstract void validate(User user);

    public abstract void notyfyUser(User user);

}
