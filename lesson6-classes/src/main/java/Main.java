import org.tms.classes.PrintService;
import org.tms.classes.model.User;
import org.tms.classes.service.MathService;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        User user1 = new User();
        user1.setUsername("John");
        user1.setAge(25);
        user1.setAdmin(false);

        User user2 = new User();
        user2.setUsername("Jane");
        user2.setAge(23);
        user2.setAdmin(true);

        System.out.println(user2.getUsername());
        System.out.println(user1.getUsername());

        MathService service = new MathService();

        User user = new User();
        user.setAge(20);

        user = service.inc(new User());

        System.out.println(user.getAge());

//        int value = 10;
//
//        value = service.inc(value);
//
//        System.out.println(value);

//        int sum = service.sum(10, 20);
//
//        int resultFact = service.factorial(10);
//
//        int [] mass = {1,3,6,8,10,12,15};
//        service.printChet(mass);
        // 0 1 1 2 3 5 8 13
//        System.out.println(service.fib(40));

//        System.out.println(resultFact);
//
//        PrintService printService = new PrintService();
//        String userInfo = printService.print(user1);
//        System.out.println(userInfo);
//
//        String print = printService.print(10);
//        System.out.println(print);
//
//        System.out.println();


    }

}
