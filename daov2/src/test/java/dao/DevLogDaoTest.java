package dao;

import entity.DevLog;
import org.junit.Test;

import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
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
//        Date date= new Date("2018-07-29 12:26:32");
//        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
//        ParsePosition pp = new ParsePosition( 0 );
//        Date date1 = format.parse(beginTime,pp);
//        date1 = new SimpleDateFormat("yyyy-MM-dd ").parse("2018-07-29 ",pp);

       // System.out.println(endTime);
       // System.out.println(date);
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = formatter.format(currentTime);
        ParsePosition pos = new ParsePosition(8);
        Date currentTime_2 = formatter.parse(dateString, pos);


        Date date1 = new Date(2020,6,28);
        devLog.setEndTime(currentTime_2);
      //  devLog.setEndTime(date2);
        System.out.println(currentTime_2);
       // System.out.println(date2);
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

    @Test
    public void selectByDevAndCompany(){
        List<Map> maps= dao.selectByDevAndCompany("System",1);

        for (Map map : maps) {
            System.out.println(map.get("num")+"\t"+map.get("company"));
        }
    }

//    @Test
//    public void selectCompare(){
//        Compare compare1 = new Compare();
//        compare1.setCompanyid(1);
//        compare1.setDevno("System");
//        Compare compare2 = new Compare();
//        compare2.setCompanyid(2);
//        compare2.setDevno("System");
//        List<Compare> list = new ArrayList<>();
//        list.add(compare1);
//        list.add(compare2);
//        List<DevLog> devLogs= dao.selectCompare(list);
//        System.out.println(devLogs);
//    }

        @Test
    public void selectCompare(){
            String  time = "2018-01-09";
            try{
                SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
                Date date = sdf.parse(time);
                dao.selectByStatus(1,date);
            }catch(ParseException e){
                System.out.println(e.getMessage());
            }


             System.out.println("finish----------");
    }


}
