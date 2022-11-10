package code.service.impl;

import code.dao.UserDao;
import code.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

//<bean id="userService" class="code.service.impl.UserServiceImpl">
//@Component("userService")
@Service("userService")
public class UserServiceImpl implements UserService {

    private String name;

    //<property name="userDao" ref="userDao"/>
    @Autowired
    @Qualifier("userDao") // 按照名称匹配
    private UserDao userDao;

    @Override
    public void save() {
        System.out.println(name);
        userDao.save();
    }
}