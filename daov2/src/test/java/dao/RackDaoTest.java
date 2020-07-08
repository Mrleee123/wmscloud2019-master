//package dao;
//
//import entity.Rack;
//import org.junit.Test;
//
//public class RackDaoTest {
//    RackDao dao = new RackDao();
//    @Test
//    public void add() {
//        Rack rack = new Rack();
//        rack.setStoredefId(1);
//        rack.setCid("1-1-1-1");
//        rack.setCellcode("N");
//        rack.setPalletid("10086");
//        rack.setAisle(1);
//        rack.setLayer(1);
//        rack.setRank(1);
//        rack.setRoww(1);
//        rack.setStatus("E");
//        dao.add(rack);
//    }
//
//    @Test
//    public void delete() {
//    }
//
//    @Test
//    public void update() {
//        Rack rack = new Rack();
//        rack.setStatus("A");
//        rack.setId(1l);
//        rack.setCompanyId(1);
//        dao.update(rack);
//
//
//    }
//
//    @Test
//    public void get() {
//        dao.get(1l);
//    }
//
//    @Test
//    public void selectByMore(){
//        Rack rack = new Rack();
//        rack.setPalletid("10086");
//        rack.setStoredefId(1);
//        dao.selectByMore(rack);
//        System.out.println("Finish____");
//    }
//
//    @Test
//    public void selectByStatus(){
//        Rack rack = new Rack();
//
//
//        dao.selectByStatus(1);
//        System.out.println("Finish____");
//    }
//}