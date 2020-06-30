package dao;

import entity.BillDetail;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.List;

public class BillDetailDaoTest {
    BillDetailDao dao = new BillDetailDao();

    @Test
    public void add() {
        BillDetail billDetail = new BillDetail();
        billDetail.setBill_head_id(2);
        billDetail.setCreator("system");
        billDetail.setM_id(3l);
        billDetail.setMstatus("B");
        billDetail.setNum(new BigDecimal(111));
        billDetail.setDetail_status(5);
        BigDecimal num = new BigDecimal(1000000);
        BigDecimal num1 = new BigDecimal(10000.999);
        billDetail.setWeight(num);
        billDetail.setBillno("22222");
        billDetail.setWeight(num1);
        billDetail.setBatchno("12345678911");
        billDetail.setCompanyid(1);
        dao.add(billDetail);
        System.out.println("finish");
    }

    @Test
    public void delete() {
        int result = dao.delete(3);
        System.out.println(result);
    }

    @Test
    public void update() {
        BillDetail billDetail = new BillDetail();
        billDetail.setId(2l);
        billDetail.setM_id(3l);
        billDetail.setBill_head_id(2);
        billDetail.setUpdator("user2");
        billDetail.setMemo("测试2");
        billDetail.setBillno("101111HHHH");
        billDetail.setCompanyid(1);
        int result = dao.update(billDetail);
        System.out.println(result);
    }

    @Test
    public void get() {
        dao.get(1l);
    }


    @Test
    public void selectByMore() {
        BillDetail billDetail = new BillDetail();
       // billDetail.setCreator("system");
        //billDetail.setBillno("101111HHHH");
        //billDetail.setMinstore("11111");s
        billDetail.setCompanyid(1);

        List<BillDetail> result = dao.selectByMore(billDetail);
        System.out.println(result);
    }
}