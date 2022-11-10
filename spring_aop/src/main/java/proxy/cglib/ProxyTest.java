package proxy.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ProxyTest {

    public static void main(String[] args) {
        Target target = new Target();
        Advice advice = new Advice();

        Enhancer enhancer = new Enhancer();

        enhancer.setSuperclass(Target.class);

        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                advice.before();
                Object invoke = method.invoke(target, args);
                advice.after();
                return invoke;
            }
        });

        Target o = (Target) enhancer.create();
        o.save();
    }
}
