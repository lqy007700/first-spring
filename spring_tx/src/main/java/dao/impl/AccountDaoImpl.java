package dao.impl;

import dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("accountDao")
public class AccountDaoImpl implements AccountDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

//    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//    }

    public void out(String user, int num) {
        jdbcTemplate.update("update account set money = money - ? where name = ? and money >= ?", num, user, num);
    }

    public void in(String user, int num) {
        jdbcTemplate.update("update account set money = money + ? where name = ?", num, user);
    }
}
