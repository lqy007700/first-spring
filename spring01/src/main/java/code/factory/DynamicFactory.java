package code.factory;

import code.dao.UserDao;
import code.dao.impl.UserDaoImpl;

public class DynamicFactory {

    public UserDao getUserDao() {
        System.out.println("factory");
        return new UserDaoImpl();
    }
}
