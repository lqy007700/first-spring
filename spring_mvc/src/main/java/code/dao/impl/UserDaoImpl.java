package code.dao.impl;

import code.dao.UserDao;
import org.springframework.stereotype.Repository;

public class UserDaoImpl implements UserDao {
    public void save() {
        System.out.println("save");
    }
}
