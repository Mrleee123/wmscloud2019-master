package dao;

import entity.Role;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class RoleDaoTest {

    RoleDao dao = new RoleDao();

    @Test
    public void add() {
        Role role = new Role();
        role.setRoleCode("010221");
        role.setRoleName("库官员");
        role.setCreator("system");
        int result =dao.add(role);
        if(result == 1){
            System.out.println("成功");
        }
        System.out.println("finish");
    }

    @Test
    public void delete() {
        int result =dao.delete(2);
        if(result == 1){
            System.out.println("成功");
        }
        System.out.println("finish");
    }

    @Test
    public void update() {
        Role role = new Role();
        role.setRoleName("库官员11");
        role.setId(1);
        role.setCompanyId(1);
        int result =dao.update(role);
        if(result == 1){
            System.out.println("成功");
        }
        System.out.println("finish");
    }

    @Test
    public void get() {
        Role role = dao.get(1);
        System.out.println("finish");
    }

    @Test
    public void list() {
        List<Role> role = dao.list();
        System.out.println("finish");
    }

    @Test
    public void forbiddenRole(){
        int result = dao.forbiddenRoleById(1);
        if(result == 1){
            System.out.println("成功");
        }
        System.out.println("finish");
    }

    @Test
    public void enableRole(){
        int result = dao.enableRoleById(1);
        if(result == 1){
            System.out.println("成功");
        }
        System.out.println("finish");
    }

    @Test
    public void selectByMore() {
        Role role = new Role();
        role.setIsenabled(1);
        role.setCompanyId(1);
        List<Role> result =dao.selectByMore(role);

            System.out.println("成功");

    }
}