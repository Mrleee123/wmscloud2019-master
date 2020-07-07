//package dao;
//
//import entity.WorkFlow;
//import org.junit.Test;
//
//import java.util.Date;
//import java.util.List;
//
//public class WorkFlowDaoTest {
//    WorkFlowDao dao = new WorkFlowDao();
//
//    @Test
//    public void add() {
//        WorkFlow WorkFlow = new WorkFlow();
//        Date date = new Date();
//        WorkFlow.setLtime(date);
//        WorkFlow.setStoredefId(1);
//        WorkFlow.setStackerid("2");
//        WorkFlow.setWorkType("D");
//        WorkFlow.setPalletid("20001110");
//        WorkFlow.setAisle(1);
//        WorkFlow.setSlayer(1);
//        WorkFlow.setSrank(1);
//        WorkFlow.setSrow(2);
//        WorkFlow.setTlayer(3);
//
//        WorkFlow.setTrank(3);
//        WorkFlow.setTrow(2);
//        WorkFlow.setStatus("M");
//        WorkFlow.setWorkindx(123124l);
//        WorkFlow.setSendTime(date);
//        WorkFlow.setCreator("mm");
//        WorkFlow.setCompanyId(1);
//        dao.add(WorkFlow);
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
//        WorkFlow WorkFlow = new WorkFlow();
//        WorkFlow.setId(3l);
//        WorkFlow.setProjectid(2);
//        dao.update(WorkFlow);
//
//    }
//
//    @Test
//    public void get() {
//        dao.get(2l);
//    }
//
//
//    @Test
//    public void selectByMore() {
//        WorkFlow WorkFlow = new WorkFlow();
//        // WorkFlow.setDetail("System");
//        //WorkFlow.setMinstore("11111");
//       // WorkFlow.setCompanyId(1);
//
//        List<WorkFlow> result =dao.selectByMore(WorkFlow);
//        System.out.println(result);
//    }
//}
//
