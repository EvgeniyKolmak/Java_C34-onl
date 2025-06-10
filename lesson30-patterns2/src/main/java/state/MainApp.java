package state;

public class MainApp {

    public static void main(String[] args) {

        CalculateService service = new CalculateService();

        int x = 10;
        int y = 3;

        System.out.println("ADD = " + service.calc(x, y));

        service.setMethod(CalculateService.Method.SUB);

        System.out.println("SUB = " + service.calc(x, y));

        service.setMethod(CalculateService.Method.MUL);

        System.out.println("MUL = " + service.calc(x, y));

        service.setMethod(CalculateService.Method.DIV);

        System.out.println("DIV = " + service.calc(x, y));

    }

}
