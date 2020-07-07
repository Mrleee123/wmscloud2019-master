//package dao;
//
//import entity.UserRole;
//import org.junit.Test;
//
//import static org.junit.Assert.*;
//
//public class UserRoleDaoTest {
//    UserRoleDao dao = new UserRoleDao();
//
//    @Test
//    public void add() {
//        UserRole userRole  = new UserRole();
//        userRole.setRoleCode("011");
//        userRole.setUserCode("MM");
//        dao.add(userRole);
//    }
//
//    @Test
//    public void delete() {
//        dao.delete(4l);
//    }
//
//    @Test
//    public void update() {
//        UserRole userRole  = new UserRole();
//
//        userRole.setId(3l);
//        userRole.setRoleCode("011");
//        userRole.setUserCode("user");
//        dao.update(userRole);
//    }
//
//    @Test
//    public void get() {
//        dao.getByUserCode("user");
//    }
//}