package dao;

import entity.Matmain;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class MatMainDaoTest {

  MatMainDao matMainDao = new MatMainDao();

    @Test
    public void add() {
        Matmain matmain = new Matmain();
        matmain.setMatmainid("A001");
        matmain.setMmname("电子");
        matmain.setMemo("测试");
        matmain.setCreator("System");
        matMainDao.add(matmain);
        System.out.println("finish");
    }

    @Test
    public void delete() {
        int result =matMainDao.delete(2);
        System.out.println(result);
    }

    @Test
    public void update() {
        Matmain matmain = new Matmain();
        matmain.setId(1);
        matmain.setMmname("");
        matmain.setMemo("修改1");
        matmain.setCompanyId(1);
        matMainDao.update(matmain);
        System.out.println("Finish");
    }

    @Test
    public void get() {
        Matmain matMain = matMainDao.get(1);

    }

    @Test
    public void list() {
        List<Matmain> list = matMainDao.list();
    }

    @Test
    public void selectByMore() {
        Matmain matmain = new Matmain();
        matmain.setCreator("System");
        matmain.setCompanyId(1);
        //matmain.setMmname("");
      //  matmain.setMemo("修改1");
        matMainDao.selectByMore(matmain);
        System.out.println("Finish");
    }
}