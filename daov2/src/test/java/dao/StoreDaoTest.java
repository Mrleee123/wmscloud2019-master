package dao;

import entity.Store;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

public class StoreDaoTest {
    StoreDao dao = new StoreDao();

    @Test
    public void add() {
        Store store =  new Store();
        store.setStoredefId(1);
        store.setcId(2l);
        store.setPalletid("100086");
        store.setmId(2l);
        BigDecimal num = new BigDecimal(1000000);
        BigDecimal num1 = new BigDecimal(10000.999);
        store.setWeight(num);
        store.setMstatus("AAAAA");
        store.setWeight(num1);
        store.setBatchno("124124");
        store.setVendorId(2);
        store.setMemo("ceshi");
        store.setCompanyId(1);
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