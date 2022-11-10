package code.demo;

import code.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class User {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        code.service.UserService user = (UserService) app.getBean("userServiceImpl");
        user.save();
    }
}
