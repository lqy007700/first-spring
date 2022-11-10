package code.dao.impl;

import code.dao.UserDao;
import code.doman.User;

import java.util.List;
import java.util.Map;

public class UserDaoImpl implements UserDao {

    private List<String> strList;
    private Map<String, User> saoList;

    public void setStrList(List<String> strList) {
        this.strList = strList;
    }

    public void setSaoList(Map<String, User> saoList) {
        this.saoList = saoList;
    }

    public List<String> getStrList() {
        return strList;
    }

    public Map<String, User> getSaoList() {
        return saoList;
    }

    private String username;
    private int age;

    public String getUsername() {
        return username;
    }

    public int getAge() {
        return age;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public UserDaoImpl() {
        System.out.println("对象被创建");
    }

    public void save() {

        for (Map.Entry<String, User> entry : saoList.entrySet()) {
            User user = entry.getValue();

            System.out.println("姓名：" + user.getUsername() + "，年龄：" + user.getAge() + "，简介：" + user.getDesc());
        }

        System.out.println("user save");
    }
}
