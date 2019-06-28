package dao;

import entity.User;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class UserDaoTest {

    @Test
    public void add() {
        User user  = new User();
        user.setUserCode("MM1");
        user.setPassword("11");
        user.setCreator("system");
        user.setDemo("测");
        UserDao dao =  new UserDao();
        int result =  dao.add(user);
        if (result ==1) {
            System.out.println("成功");
        }
        System.out.println("finish");
    }

    @Test
    public void delete() {
        long a = 6;
        UserDao dao = new UserDao();
        int result =  dao.delete(a);
        if (result ==1) {
            System.out.println("成功");
        }
        System.out.println("finish");
    }

    @Test
    public void update() {
        User user  = new User();
       // user.setUserCode("MM1");
        user.setId(5L);
        user.setUserName("江小P");
        user.setPassword("123456");
       // user.setCreator("system");
        user.setDemo("测试");
        UserDao dao =  new UserDao();
        int result =  dao.update(user);
        if (result ==1) {
            System.out.println("成功");
        }
        System.out.println("finish");
    }

    @Test
    public void get() {
        long a = 1;
        UserDao dao = new UserDao();
        User user = dao.get(a);
        System.out.println("-------test finish----------");
    }

    @Test
    public void list() {
        UserDao dao = new UserDao();
        List<User> list = dao.list();
       // assertEquals(4, list.size());
        System.out.println("-------test finish----------");
    }

    @Test
    public void login()  {
        User user =new User();
        UserDao dao = new UserDao();
         user = dao.loginByCodeAndPwd("lixiaobo","123456qaz");
        // assertEquals(4, list.size());
        System.out.println("-------test finish----------");
    }
}