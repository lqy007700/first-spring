package code.listener;

import org.springframework.context.ApplicationContext;
import javax.servlet.ServletContext;

public class WebApplicationContextUtils {

    public static ApplicationContext getApplicationContext(ServletContext sc) {
        return (ApplicationContext) sc.getAttribute("app");
    }
}
