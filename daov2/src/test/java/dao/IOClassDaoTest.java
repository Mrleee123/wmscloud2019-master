package dao;

import entity.IOClass;
import org.junit.Test;

import java.util.List;

public class IOClassDaoTest {
    
    IOClassDao dao = new IOClassDao();
    
    @Test
    public void add() {
        IOClass ioClass = new IOClass();
        ioClass.setCompanyId(1);
        ioClass.setCreator("system");
        ioClass.setIoclassCode("02");
        ioClass.setIoclassName("出库");
        ioClass.setTranType("O");

        dao.add(ioClass);
        System.out.println("finish");
    }

    @Test
    public void delete() {
        int result =dao.delete(3);
        System.out.println(result);
    }

    @Test
    public void update() {
        IOClass ioClass = new IOClass();
        ioClass.setId(1);
        ioClass.setUpdator("user2");
        ioClass.setMemo("测试2");
        ioClass.setCompanyId(1);
        int result =dao.update(ioClass);
        System.out.println(result);
    }

    @Test
    public void get() {
        dao.get(2);
    }


    @Test
    public void selectByMore() {
        IOClass ioClass = new IOClass();
        ioClass.setCreator("System");
        //ioClass.setMinstore("11111");s
        ioClass.setCompanyId(1);
        ioClass.setTranType("I");
        List<IOClass> result =dao.selectByMore(ioClass);
        System.out.println(result);
    }

}
