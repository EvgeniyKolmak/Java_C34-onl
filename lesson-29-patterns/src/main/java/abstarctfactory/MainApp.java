package abstarctfactory;

public class MainApp {

    public static void main(String[] args) {

        var car = new CarConstractService()
                .create(new AudiCarAbstaractFactoryImpl());

        System.out.println(car);

    }

}
