package singleton;

public class MainApp {

    public static void main(String[] args) {

        MySingletonService service1 = new MySingletonService();
        MySingletonService service2 = new MySingletonService();

        service1.setAge(10);

        Thread thread = new Thread(() -> {
            service1.printAge();
        });

        thread.start();

        Thread thread2 = new Thread(() -> {
            service2.setAge(30);
        });

        thread2.start();

//
//        service1.setAge(10);
//
//        service1.printAge();

    }

}
