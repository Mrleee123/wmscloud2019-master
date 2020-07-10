package dao;

import entity.Project;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class ProjectDaoTest {
    ProjectDao dao = new ProjectDao();
//
//    @Test
//    public void add() {
//        Project Project = new Project();
//        Date date = new Date();
//        Project.setProjectName("正大");
//        Project.setProjectCode("AB123");
//        Project.setContractName("bzkj");
//        Project.setTotalprice(1000000);
//        Project.setInvoiced(12l);
//        Project.setPaidInPrice("2233");
//        Project.setStatus("A");
//        Project.setLeadorElectric("电气人员");
//        Project.setLeadorSoft("软件人员");
//        Project.setMm("项目经理");
//        Project.setPm("市场经理");
//        Project.setDrawingDesign("电气图纸");
//        Project.setStarttime(date);
//        Project.setCompanyId(1);
//        Project.setAislenum(11);
//        Project.setRacknum(17892l);
//        Project.setCity("北京");
//        Project.setCompanyId(1);
//        Project.setDevnum(22l);
//        dao.add(Project);
//        System.out.println("finish");
//    }
//
//    @Test
//    public void delete() {
//        int result =dao.delete(1);
//        System.out.println(result);
//    }
//
//    @Test
//    public void update() {
//        Project Project = new Project();
//        Project.setId(1l);
//        Date date = new Date();
//        Project.setCompanyId(1);
//        int result =dao.update(Project);
//        System.out.println(result);
//    }
//
//    @Test
//    public void get() {
//        dao.get(1l);
//    }


    @Test
    public void selectByMore() {
        Project Project = new Project();
        // Project.setDetail("System");
        //Project.setMinstore("11111");
        //Project.setCompanyId(1);
        List<Project> result =dao.selectByMore(Project);
        System.out.println(result);
    }

    @Test
    public void selectAddress(){
        List<Map> maps= dao.selectAddress();

        for (Map map : maps) {
            System.out.println(map.get("num")+"\t"+map.get("city"));
        }
    }
}
