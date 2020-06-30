package dao;


import entity.RoleFunction;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class RoleFunctionDaoTest {
    RoleFunctionDao dao = new RoleFunctionDao();

    @Test
    public void add() {
        RoleFunction roleFunction = new RoleFunction();
        roleFunction.setRoleCode("0101");
        roleFunction.setFunctionName("z库管理");
        int result =dao.add(roleFunction);
        if(result == 1){
            System.out.println("成功");
        }
        System.out.println("finish");
    }

    @Test
    public void delete() {
        int result =dao.delete(3);
        if(result == 1){
            System.out.println("成功");
        }
        System.out.println("finish");
    }

    @Test
    public void update() {
        RoleFunction role = new RoleFunction();
        role.setRoleCode("010");
        role.setId(1);
        int result =dao.update(role);
        if(result == 1){
            System.out.println("成功");
        }
        System.out.println("finish");
    }

    @Test
    public void get() {
        RoleFunction role = dao.get(1);
        System.out.println("finish");
    }

    @Test
    public void list() {
        List<RoleFunction> role = dao.list();
        System.out.println("finish");
    }

    @Test
    public void insertList(){
        RoleFunction roleFunction1 = new RoleFunction();
        roleFunction1.setRoleCode("0101");
        roleFunction1.setFunctionName("盘库管理");
        roleFunction1.setCompanyId(1);
        RoleFunction roleFunction2 = new RoleFunction();
        roleFunction2.setRoleCode("010");
        roleFunction2.setFunctionName("物料管理");
        roleFunction2.setCompanyId(1);
        RoleFunction roleFunction3 = new RoleFunction();
        roleFunction3.setRoleCode("010");
        roleFunction3.setFunctionName("作业管理");
        roleFunction3.setCompanyId(1);

        List<RoleFunction> roleFunctionList = new ArrayList<>();
        roleFunctionList.add(roleFunction1);
        roleFunctionList.add(roleFunction2);
      //  roleFunctionList.add(roleFunction3);
        System.out.println(roleFunctionList);
        int result =dao.insertList(roleFunctionList);
        if(result == 1){
            System.out.println("成功");
        }
        System.out.println("finish");
    }

    @Test
    public void deleteList(){
        List list = new ArrayList();
        list.add(6);
        list.add(7);
        System.out.println(list);
//        int result =dao.deleteList(list);
//        if(result == 1){
//            System.out.println("成功");
//        }
//        System.out.println("finish");
    }

    @Test
    public void selectByMore(){
        RoleFunction roleFunction = new RoleFunction();
        roleFunction.setRoleCode("010");
        roleFunction.setCompanyId(1);
        dao.selectByMore(roleFunction);

    }
}