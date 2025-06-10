package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvokationHandler implements InvocationHandler {

    private A a;

    public MyInvokationHandler(A a) {
        this.a = a;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        var text = a.getText();
        return text +  "proxy";
    }
}
