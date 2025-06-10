package prototype;

import java.util.ArrayList;
import java.util.List;

public class MyPrototype implements Cloneable {

    private String name;
    private int age;

    private List<String> list = new ArrayList<>();

    public MyPrototype(String name, int age, List<String> list) {
        this.name = name;
        this.age = age;
        this.list = list;
    }

    protected MyPrototype copy() throws CloneNotSupportedException {

        List<String> newList = new ArrayList<>();

        list.forEach(newList::add);

        return new MyPrototype(name, age, newList);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void addToList(String item) {
        list.add(item);
    }

    @Override
    public String toString() {
        return "MyPrototype{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", list=" + list +
                '}';
    }
}
