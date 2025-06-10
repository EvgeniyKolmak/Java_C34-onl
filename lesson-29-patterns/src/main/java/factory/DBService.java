package factory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class DBService {

    private static Integer currentId = 0;
    private static List<String> names = new ArrayList<>();

    public static DBService getConnection() {
        return new DBService();
    }

    public Integer getId() {
        return ++currentId;
    }

    public String checkName(String name) {
        if (names.contains(name)) {
            var newName = name + UUID.randomUUID();
            names.add(newName);
            return newName;
        }

        names.add(name);
        return name;
    }

    public void close() {
        System.out.println("Connection closed");
    }

}
