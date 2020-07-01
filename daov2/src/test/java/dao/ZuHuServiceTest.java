package dao;

import entity.ZuHuService;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.List;

public class ZuHuServiceTest {
    ZuHuServiceDao dao = new ZuHuServiceDao();

    @Test
    public void add() {
        ZuHuService ZuHuService = new ZuHuService();
        ZuHuService.setZuhuId(1);
        ZuHuService.setServiceId(1);
        ZuHuService.setTimework(55);
        ZuHuService.setTimeleft(99);
        ZuHuService.setMoneyleft(new BigDecimal(5000));
        dao.add(ZuHuService);
        System.out.println("finish");
    }

    @Test
    public void delete() {
        int result =dao.delete(1);
        System.out.println(result);
    }

    @Test
    public void update() {
        ZuHuService ZuHuService = new ZuHuService();
        ZuHuService.setId(2);
        ZuHuService.setZuhuId(1);
        ZuHuService.setServiceId(1);
        ZuHuService.setTimework(55);
        ZuHuService.setTimeleft(99);
        ZuHuService.setMoneyleft(new BigDecimal(5000));
        int result =dao.update(ZuHuService);
        System.out.println(result);
    }

    @Test
    public void get() {
        dao.get(2);
    }


    @Test
    public void selectByMore() {
        ZuHuService ZuHuService = new ZuHuService();
        // ZuHuService.setDetail("System");
        //ZuHuService.setMinstore("11111");
        //ZuHuService.setCompanyId(1);
        List<ZuHuService> result =dao.selectByMore(ZuHuService);
        System.out.println(result);
    }
}
