//package dao;
//
//import entity.User;
//import org.junit.Test;
//
//import java.util.List;
//
//public class UserDaoTest {
//
//    @Test
//    public void add() {
//        User user  = new User();
//        user.setUserCode("MM1");
//        user.setPassword("11");
//        user.setUserName("MMMMMMMMMMMMMMMMMMMMMMMMMMMM");
//        user.setCreator("system");
//        user.setDemo("测33");
//        UserDao dao =  new UserDao();
//        int result =  dao.add(user);
//        if (result ==1) {
//            System.out.println("成功");
//        }
//        System.out.println("finish");
//    }
//
//    @Test
//    public void delete() {
//        long a = 5;
//        UserDao dao = new UserDao();
//        int result =  dao.delete(a);
//        if (result ==1) {
//            System.out.println("成功");
//        }
//        System.out.println("finish");
//    }
//
//    @Test
//    public void update() {
//        User user  = new User();
//       // user.setUserCode("MM1");
//        user.setId(3L);
//        user.setUserName("江小P111");
//        user.setPassword("123456");
//        user.setIsdeleted(1);
//       // user.setCreator("system");
//        user.setDemo("测试0708");
//        user.setCompanyId(1);
//        UserDao dao =  new UserDao();
//        int result =  dao.update(user);
//        if (result ==1) {
//            System.out.println("成功");
//        }
//        System.out.println("finish");
//    }
//
//    @Test
//    public void get() {
//        //long a = 1;
//        UserDao dao = new UserDao();
//
//        User user = dao.selectByUserCode("system");
//        System.out.println("-------test finish----------");
//    }
//
//    @Test
//    public void list() {
//        UserDao dao = new UserDao();
//        List<User> list = dao.list();
//       // assertEquals(4, list.size());
//        System.out.println("-------test finish----------");
//    }
////
////    @Test
////    public void login()  {
////        User user =new User();
////        UserDao dao = new UserDao();
////         user = dao.loginByCodeAndPwd("lixiaobo111","");
////        // assertEquals(4, list.size());
////        System.out.println("-------test finish----------");
////    }
//
//    @Test
//    public void forbiddenUser()  {
//
//        UserDao dao = new UserDao();
//       dao.forbiddenUser(6);
//        // assertEquals(4, list.size());
//        System.out.println("-------test finish----------");
//    }
//
//    @Test
//    public void enableUserById()  {
//
//        UserDao dao = new UserDao();
//        dao.enableUserById(6);
//        // assertEquals(4, list.size());
//        System.out.println("-------test finish----------");
//    }
//
//    @Test
//    public void selectByMore()  {
//
//        UserDao dao = new UserDao();
//        User user = new User() ;
//        user.setCreator("system");
//        dao.selectByMore(user);
//        // assertEquals(4, list.size());
//        System.out.println("-------test finish----------");
//    }
//
//        @Test
//    public void selectTotalNumber() {
//
//
//        UserDao dao = new UserDao();
//        int result =dao.selectTotalNumber(1);
//        System.out.println(result);
//    }
//
//}