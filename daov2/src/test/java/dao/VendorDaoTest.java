//package dao;
//
//import entity.Vendor;
//import org.junit.Test;
//
//import static org.junit.Assert.*;
//
//public class VendorDaoTest {
//    VendorDao vendorDao = new VendorDao();
//
//    @Test
//    public void add() {
//        Vendor vendor = new Vendor();
//        vendor.setVendorName("11212");
//        vendor.setMemo("测试");
//        vendor.setCreator("system");
//        vendorDao.add(vendor);
//    }
//
//    @Test
//    public void delete() {
//        vendorDao.delete(4);
//    }
//
//    @Test
//    public void update() {
//        Vendor vendor = new Vendor();
//        vendor.setId(5l);
//        vendor.setMemo("测试2");
//        vendor.setCreator("system");
//        vendor.setCompanyId(1);
//        vendorDao.update(vendor);
//    }
//
//    @Test
//    public void get() {
//        vendorDao.get(5l);
//    }
//
//    @Test
//    public void list() {
//        vendorDao.list();
//    }
//
//    @Test
//    public void selectByMore() {
//        Vendor vendor = new Vendor();
//       vendor.setVendorName("1122");
//       // vendor.setMemo("测试1");
//        //vendor.setCreator("system");
//        vendorDao.selectByMore(vendor);
//    }
//}