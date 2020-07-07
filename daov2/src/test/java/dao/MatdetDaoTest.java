//package dao;
//
//import entity.Matdet;
//import org.junit.Test;
//
//import java.util.List;
//
//public class MatdetDaoTest {
//    MatdetDao dao = new MatdetDao();
//
//    @Test
//    public void add() {
//        Matdet matdet = new Matdet();
//        matdet.setMatmainId(3l);
//        matdet.setMatname("笔记本1");
//        matdet.setMemo("测试");
//        matdet.setMunit("kg");
//        matdet.setMweight("1000");
//        matdet.setMaxstore("100");
//        matdet.setMinstore("1");
//        matdet.setStorageTime(360);
//        matdet.setCreator("System");
//        matdet.setMspeci("50x59");
//        matdet.setMid("0D00011111");
//        dao.add(matdet);
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
//        Matdet matdet = new Matdet();
//        matdet.setId(2l);
//        matdet.setUpdator("user1");
//        matdet.setMinstore("11111");
//        matdet.setCompanyId(1);
//        int result =dao.update(matdet);
//        System.out.println(result);
//    }
//
//    @Test
//    public void get() {
//     dao.get(2l);
//    }
//
//    @Test
//    public void list() {
//        dao.list();
//    }
//
//    @Test
//    public void selectByMore() {
//        Matdet matdet = new Matdet();
//        matdet.setCreator("System");
//        //matdet.setMinstore("11111");
//        matdet.setCompanyId(1);
//        List<Matdet> result =dao.selectByMore(matdet);
//        System.out.println(result);
//    }
//}