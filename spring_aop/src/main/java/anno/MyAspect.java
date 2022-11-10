package anno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component("myAspect")
@Aspect // 标注切面类
public class MyAspect {

    @Before("execution(* anno.*.*(..))")
    public void before() {
        System.out.println("前置增强");
    }

    @Before("execution(* anno.*.*(..))")
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
