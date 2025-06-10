package factory;

public class MainApp {

    public static void main(String[] args) {

        String name1 = "name1";
        String name2 = "name2";

        var store1 = StoreFactoryService.createStore(name1);
        var store2 = StoreFactoryService.createStore(name2);

        System.out.println(store1);
        System.out.println(store2);


    }

}
