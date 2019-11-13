package dao;

import entity.Store;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

public class StoreDaoTest {
    StoreDao dao = new StoreDao();

    @Test
    public void add() {
        Store store =  new Store();
        store.setStoredefId(2);
        store.setcId(3l);
        store.setPalletid("200096");
        store.setmId(2l);
        BigDecimal num = new BigDecimal(8888);
        BigDecimal num1 = new BigDecimal(1088.999);
        store.setWeight(num);
        store.setMstatus("BBB");
        Date date =  new Date();
        store.setProductionDate(date.toString());
        store.setWeight(num1);
        store.setBatchno("20191111");
        store.setVendorId(2);
        store.setMemo("测试");
        store.setCompanyId(1);
        store.setBillHeadId(1);
        store.setBillDetailId(2);
        int result = dao.add(store);
        System.out.println(result);
         System.out.println("--------finish---------");
    }

    @Test
    public void delete() {
    }

    @Test
    public void update() {
        Store store  =  new Store();
        store.setId(1);
        BigDecimal num = new BigDecimal(1000);
        store.setNum(num);
       store.setCompanyId(2);
        store.setmId(3l);
        int result = dao.update(store);
        System.out.println(result);
        System.out.println("--------finish---------");
    }

    @Test
    public void get() {
        dao.get(1);
    }

    @Test
    public void selectByMore() {
        Store store = new Store();
        List<Store> result= dao.selectByMore(store);
        System.out.println(result);
        System.out.println("--------finish---------");
    }
}