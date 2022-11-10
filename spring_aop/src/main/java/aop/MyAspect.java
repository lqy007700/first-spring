package aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {
    public void before() {
        System.out.println("前置增强");
    }

    public void after() {
        System.out.println("后置增强");
    }

    public Object around(ProceedingJoinPoint p) throws Throwable {
        System.out.println("环绕前");
        Object proceed = p.proceed();
        System.out.println("环绕后");
        return proceed;
    }

    public void throwing() {
        System.out.println("异常");
    }
}
