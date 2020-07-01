package dao;

import entity.Service;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class ServiceDaoTest {
    ServiceDao dao = new ServiceDao();

    @Test
    public void add() {
        Service Service = new Service();
        Date date = new Date();
        Service.setCreateTime(date);
        Service.setServiceName("库存管理");
        Service.setServiceAddress("127.0.0.1");
        Service.setIsenabled(1);
        Service.setPrice(new BigDecimal(100.00000));
        Service.setUnit("万元");
        Service.setCompanyId(1);

        dao.add(Service);
        System.out.println("finish");
    }

    @Test
    public void delete() {
        int result =dao.delete(1);
        System.out.println(result);
    }

    @Test
    public void update() {
        Service Service = new Service();
        Service.setId(1l);
        Date date = new Date();
        Service.setServiceName("库存管理");
        Service.setServiceAddress("127.0.0.1");
        Service.setIsenabled(1);
        Service.setPrice(new BigDecimal(100.00000));
        Service.setUnit("万元");

        Service.setCompanyId(2);
        int result =dao.update(Service);
        System.out.println(result);
    }

    @Test
    public void get() {
        dao.get(1l);
    }


    @Test
    public void selectByMore() {
        Service Service = new Service();
        // Service.setDetail("System");
        //Service.setMinstore("11111");
        //Service.setCompanyId(1);
        List<Service> result =dao.selectByMore(Service);
        System.out.println(result);
    }
}
