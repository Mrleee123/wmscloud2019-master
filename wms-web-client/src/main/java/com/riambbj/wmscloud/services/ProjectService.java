package com.riambbj.wmscloud.services;

import dao.ProjectDao;
import entity.Project;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProjectService {
    @Autowired
    ProjectDao dao = new ProjectDao();

    public int insertProjectInfo(Project Project){
        return dao.add(Project);
    }

    public int deleteProjectById(long id){
        return dao.delete(id);
    }

    public int updateProjectInfo(Project Project){
        return dao.update(Project);
    }

    public Project selectProjectByid(long id){
        return dao.get(id);
    }



    public List<Project> selectByMore(Project Project, int currPage, int pageSize){
        List<Project> list = dao.selectByMore(Project);
        int firstIndex= (currPage-1)*pageSize;
        int lastIndex=currPage*pageSize;
        return list.subList(firstIndex,lastIndex);}
}
