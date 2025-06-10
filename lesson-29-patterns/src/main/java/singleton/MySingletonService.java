package singleton;

public class MySingletonService {

    private static MySingletonService instance;

    private String name;
    private int age;

    public MySingletonService() {
        System.out.println("MySingletonService created");
    }

    public static MySingletonService getInstance() {
        if (instance == null) {
            synchronized (MySingletonService.class) {
                if (instance != null) {
                    return instance;
                } else {
                    instance = new MySingletonService();
                }
            }
        }

        return instance;
    }

    public void printAge() {
        System.out.println(age);

        try {
            Thread.sleep(10_000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        age++;
        System.out.println(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
