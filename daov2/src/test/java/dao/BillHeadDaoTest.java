package dao;

import entity.BillHead;
import org.junit.Test;

import java.util.List;

public class BillHeadDaoTest {
    BillHeadDao dao = new BillHeadDao();

    @Test
    public void add() {
        BillHead billHead = new BillHead();
        billHead.setCompanyId(1);
        billHead.setCreator("system");
        billHead.setStoredefId(1);
        billHead.setIoclassId(1);
        billHead.setHeadStatus(5);
        billHead.setVendorId(1);
        billHead.setBillno("1111222333HHH");
        billHead.setCompanyId(1);
        dao.add(billHead);
        System.out.println("finish");
    }

    @Test
    public void delete() {
        int result = dao.delete(3);
        System.out.println(result);
    }

    @Test
    public void update() {
        BillHead billHead = new BillHead();
        billHead.setId(1l);
        billHead.setUpdator("user2");
        billHead.setMemo("测试2");
        billHead.setBillno("101111HHHH");
        billHead.setCompanyId(1);
        int result = dao.update(billHead);
        System.out.println(result);
    }

    @Test
    public void get() {
        dao.get(1l);
    }


    @Test
    public void selectByMore() {
        BillHead billHead = new BillHead();
        billHead.setCreator("System");
        billHead.setBillno("101111HHHH");
        //billHead.setMinstore("11111");s
        billHead.setCompanyId(1);

        List<BillHead> result = dao.selectByMore(billHead);
        System.out.println(result);
    }
}