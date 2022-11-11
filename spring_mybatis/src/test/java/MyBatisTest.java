import domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyBatisTest {

    @Test
    public void test1() throws IOException {
        InputStream stream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(stream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<User> objects = sqlSession.selectList("userMapper.findAll");

        System.out.println(objects.toString());
        sqlSession.close();
    }

    @Test
    public void test2() throws IOException {
        User user = new User();
        user.setName("123");
        user.setPwd("123");

        InputStream stream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(stream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        int objects = sqlSession.insert("userMapper.save", user);
        sqlSession.commit();

        System.out.println(objects);
        sqlSession.close();
    }

    @Test
    public void test3() throws IOException {
        User user = new User();
        user.setName("444");
        user.setId(3);

        InputStream stream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(stream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        int update = sqlSession.update("userMapper.update", user);
        sqlSession.commit();

        System.out.println(update);
        sqlSession.close();
    }
}
