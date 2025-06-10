package adapter;

public class MainApp {

    public static void main(String[] args) {

        Service service = new Service();

        BAAdapter adapter = new BAAdapter();

        service.runMe(adapter);

    }

}
