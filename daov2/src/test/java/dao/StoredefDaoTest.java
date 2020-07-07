//package dao;
//
//import entity.Storedef;
//import org.junit.Test;
//
//import static org.junit.Assert.*;
//
//public class StoredefDaoTest {
//    StoredefDao storedefDao = new StoredefDao();
//
//    @Test
//    public void add() {
//        Storedef storedef = new Storedef();
//        storedef.setCreator("system");
//        storedef.setStoredefCode("ASAA");
//        storedef.setStoredefName("成品库");
//        storedef.setStoredefType("ASRS");
//        storedefDao.add(storedef);
//    }
//
//    @Test
//    public void delete() {
//    }
//
//    @Test
//    public void update() {
//        Storedef storedef = new Storedef();
//        storedef.setId(1l);
//        storedef.setCreator("system");
//        storedef.setStoredefCode("AAAA");
//        storedef.setMemo("测试1");
//        storedef.setUpdator("User1");
//        storedef.setStoredefName("成品库");
//        storedef.setStoredefType("ASRS");
//        storedefDao.update(storedef);
//    }
//
//    @Test
//    public void get() {
//        storedefDao.get(1l);
//    }
//
//    @Test
//    public void list(){
//        storedefDao.list();
//    }
//}