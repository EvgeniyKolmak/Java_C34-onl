package prototype;

import java.util.ArrayList;
import java.util.List;

public class MainApp {

    public static void main(String[] args) throws CloneNotSupportedException {

        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");

        MyPrototype first = new MyPrototype("first", 10, list);
        System.out.println(first);

        MyPrototype second = (MyPrototype) first.copy();
        second.setName("second");
        second.setAge(20);
        second.addToList("3");

        System.out.println("-----");
        System.out.println(first);
        System.out.println(second);

        System.out.println(first == second);

    }

}
