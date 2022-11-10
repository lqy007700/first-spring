package proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyTest {

    public static void main(String[] args) {

        Target target = new Target();

        Advice advice = new Advice();

        TargetInterface t = (TargetInterface) Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                (proxy, method, args1) -> {
                    advice.before();
                    Object invoke = method.invoke(target, args1);
                    advice.after();
                    return invoke;
                }
        );

        t.save();

    }
}
