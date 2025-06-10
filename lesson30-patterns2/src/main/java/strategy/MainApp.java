package strategy;

public class MainApp {

    public static void main(String[] args) {

        var service = new CalculateService();

        System.out.println(service.calc(10, 20, (a, b) -> a + b));

        System.out.println(service.calc(10, 20, (a, b) -> a - b));

        System.out.println(service.calc(10, 20, (a, b) -> a * b));

        System.out.println(service.calc(10, 20, (a, b) -> a / b));

    }

}
