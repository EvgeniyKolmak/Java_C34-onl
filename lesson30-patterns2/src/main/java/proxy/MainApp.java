package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MainApp {

    public static void main(String[] args) {

        Class[] massClass = {A.class};

        InvocationHandler handler = new MyInvokationHandler(new AImpl());

        var proxyObj = Proxy.newProxyInstance(MainApp.class.getClassLoader(), massClass, handler);

        System.out.print(((A) proxyObj).getText());

    }

}
