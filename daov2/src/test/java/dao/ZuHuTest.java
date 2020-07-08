//package dao;
//
//import entity.ZuHu;
//import org.junit.Test;
//
//import java.util.Date;
//import java.util.List;
//
//public class ZuHuTest {
//    ZuHuDao dao = new ZuHuDao();
//
//    @Test
//    public void add() {
//        ZuHu ZuHu = new ZuHu();
//        Date date = new Date();
//        ZuHu.setCompany("襄阳正大1");
//        ZuHu.setPreCompany(1);
//        ZuHu.setTel("12111011");
//        ZuHu.setPostcode("CD0011");
//        ZuHu.setIsmain(2);
//        ZuHu.setAddress("襄阳");
//        ZuHu.setCaegory("sd112");
//        ZuHu.setMaxnumUser(10l);
//        ZuHu.setMaxnumDev(100l);
//        ZuHu.setServiceAddress("127.0.0.1/test");
//        ZuHu.setProjectid(1l);
//        dao.add(ZuHu);
//        System.out.println("finish");
//    }
//
//    @Test
//    public void delete() {
//        int result =dao.delete(1);
//        System.out.println(result);
//    }
//
//    @Test
//    public void update() {
//        ZuHu ZuHu = new ZuHu();
//        Date date = new Date();
//        ZuHu.setId(15);
//        ZuHu.setCompany("襄阳正大");
//        ZuHu.setPreCompany(14);
//        ZuHu.setTel("12111011");
//        ZuHu.setPostcode("CD0012");
//        ZuHu.setIsmain(2);
//        ZuHu.setAddress("襄阳");
//        ZuHu.setCaegory("sd112");
//        ZuHu.setMaxnumUser(10l);
//        ZuHu.setMaxnumDev(101l);
//        ZuHu.setServiceAddress("127.0.0.1/test");
//        dao.update(ZuHu);
//        System.out.println("finish");
//    }
//
//    @Test
//    public void get() {
//        dao.get(15);
//    }
//
//
//    @Test
//    public void selectByMore() {
//        ZuHu ZuHu = new ZuHu();
//        // ZuHu.setDetail("System");
//        //ZuHu.setMinstore("11111");
//        //ZuHu.setCompanyId(1);
//        List<ZuHu> result =dao.selectByMore(ZuHu);
//        System.out.println(result);
//    }
//
//    @Test
//    public void selectTotalNumber() {
//
//        // ZuHu.setDetail("System");
//        //ZuHu.setMinstore("11111");
//        //ZuHu.setCompanyId(1);
//       int result =dao.selectTotalNumber();
//        System.out.println(result);
//    }
//}
