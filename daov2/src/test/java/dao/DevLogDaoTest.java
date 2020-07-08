package dao;

import entity.DevLog;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class DevLogDaoTest {
    DveLogDao dao = new DveLogDao();

//    @Test
//    public void add() {
//        DevLog devLog = new DevLog();
//
//        devLog.setDevno("222");
//        devLog.setMemo("测试");
//        devLog.setAcode("33223");
//        devLog.setAcontent("102200");
//        devLog.setPalletcode("66622100");
//        devLog.setCompanyId(1);
//        devLog.setCid("1-1-4-1");
//        devLog.setDevno("System");
//        devLog.setPalletid("d");
//
//        dao.add(devLog);
//        System.out.println("finish");
//    }
//
//    @Test
//    public void delete() {
//        int result =dao.delete(2);
//        System.out.println(result);
//    }
//
//    @Test
//    public void update() {
//        DevLog devLog = new DevLog();
//        devLog.setId(1);
//        devLog.setDevno("1");
//        devLog.setMemo("测试");
//        devLog.setAcode("333");
//        devLog.setAcontent("1000");
//        devLog.setPalletcode("666100");
//        devLog.setCompanyId(1);
//        devLog.setCid("1-1-2-1");
//        devLog.setDevno("System");
//        devLog.setPalletid("d");
//        devLog.setCompanyId(1);
//        int result =dao.update(devLog);
//        System.out.println(result);
//    }

    @Test
    public void get() {
        dao.get(1);
    }



    @Test
    public void selectByMore() {
        DevLog devLog = new DevLog();

//        String beginTime = "2018-07-28 14:42:32";
//        String endTime = "2018-07-29 12:26:32";
//        Date date = new Date("2018-07-29 12:26:32");
//        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
//        ParsePosition pp = new ParsePosition( 0 );
//        Date date1 = format.parse(beginTime,pp);
//        date = new SimpleDateFormat("yyyy-MM-dd ").parse("2018-07-29 ",pp);

       // System.out.println(endTime);
       // System.out.println(date);

       // Date date = new Date(2019,5,1);
      // devLog.setStartTime(date);
        //devLog.setEndTime(date);
        //devLog.setMinstore("11111");

        List<DevLog> result =dao.selectByMore(devLog);
        System.out.println(result);
    }

    @Test
    public void selectByDev(){
       List<Map> maps= dao.selectByDev("System");

        for (Map map : maps) {
            System.out.println(map.get("num")+"\t"+map.get("company"));
        }
    }
}
