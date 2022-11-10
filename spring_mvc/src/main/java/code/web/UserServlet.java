package code.web;

import code.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext sc = this.getServletContext();

//        ApplicationContext app = WebApplicationContextUtils.getApplicationContext(sc);
        ApplicationContext app = WebApplicationContextUtils.getWebApplicationContext(sc);
        assert app != null;
        UserService bean = (UserService) app.getBean("userService");
        bean.save();
    }
}
