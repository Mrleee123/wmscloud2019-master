package dao;

import entity.Log;
import org.junit.Test;

import java.util.Date;
import java.util.List;

public class LogDaoTest {
    LogDao dao = new LogDao();

    @Test
    public void add() {
        Log log = new Log();
        Date date = new Date();
        log.setLtime(date);
        log.setLclass("ss22ss");
        log.setMemo("测试");
        log.setFunmain("盘点");
        log.setUserid("1");
        log.setDetail("panjiao1");
        log.setCompanyId(1);

        dao.add(log);
        System.out.println("finish");
    }

    @Test
    public void delete() {
        int result =dao.delete(1);
        System.out.println(result);
    }

    @Test
    public void update() {
        Log log = new Log();
        log.setId(2l);
        Date date = new Date();
        log.setLtime(date);
        log.setLclass("ssss");
        log.setMemo("测试");
        log.setFunmain("盘点");
        log.setUserid("1");
        log.setDetail("panjiao");
        log.setCompanyId(1);
        log.setCompanyId(1);
        int result =dao.update(log);
        System.out.println(result);
    }

    @Test
    public void get() {
        dao.get(1l);
    }


    @Test
    public void selectByMore() {
        Log log = new Log();
       // log.setDetail("System");
        //log.setMinstore("11111");
        //log.setCompanyId(1);
        List<Log> result =dao.selectByMore(log);
        System.out.println(result);
    }
}
