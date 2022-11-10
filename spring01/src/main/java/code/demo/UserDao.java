package code.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDao {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        code.dao.UserDao userDao = (code.dao.UserDao) app.getBean("userDao");
    }
}
