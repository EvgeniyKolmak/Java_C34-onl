package factory;

public class StoreFactoryService {

    public static Store createStore(String name) {

        DBService connection = DBService.getConnection();
        var id = connection.getId() * 10;
        var name1 = connection.checkName(name);

        Store store = new Store(id, name1);

        connection.close();
        return store;
    }

}
