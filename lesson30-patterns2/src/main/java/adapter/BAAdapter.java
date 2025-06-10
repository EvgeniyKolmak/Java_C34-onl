package adapter;

public class BAAdapter implements A {

    @Override
    public void test() {
        System.out.println("BAADAPTER");
        B b = new BImpl();
        b.test();
    }
}
