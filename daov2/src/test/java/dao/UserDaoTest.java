package dao;

import entity.User;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class UserDaoTest {

    @Test
    public void add() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void update() {
    }

    @Test
    public void get() {
    }

    @Test
    public void list() throws Exception {
        UserDao dao=new UserDao();
        List<User> list=dao.list();
        assertEquals(4,list.size());
        System.out.println("-------test finish----------");
    }
}