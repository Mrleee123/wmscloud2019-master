package dao;

import dbtools.DBTools;
import entity.Project;
import mappers.ProjectMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class ProjectDao {
    private SqlSession sqlSession;
    private ProjectMapper mapper;

    public ProjectDao() {
        sqlSession = DBTools.getSession();
        mapper = sqlSession.getMapper(ProjectMapper.class);
    }

    public int add(Project matdet) {
        try {
            int result = mapper.insert(matdet);
            sqlSession.commit();
            return result;
        } finally {
            DBTools.closeSession();
        }
    }

    public int delete(long id) {
        try {
            int result = mapper.deleteByPrimaryKey(id);
            sqlSession.commit();
            return result;
        } finally {
            DBTools.closeSession();
        }
    }

    public int update(Project Project) {
        try {
//            java.sql.Date time = new java.sql.Date(new Date().getTime());
//            Date update_time = time;
//            Project.setLtime(update_time);
            int result = mapper.updateByPrimaryKeySelective(Project);
            sqlSession.commit();
            return result;
        } finally {
            DBTools.closeSession();
        }
    }

    public Project get(long id) {
        try {
            Project matdet = mapper.selectByPrimaryKey(id);
            System.out.println(matdet);
            return matdet;
        } finally {
            DBTools.closeSession();
        }
    }




    public List<Project> selectByMore(Project Project) {
        try {
            List<Project> result = mapper.selectByMore(Project);
            return result;
        } finally {
            DBTools.closeSession();
        }
    }

    public int selectTotalNumber(){
        try {
            int result = mapper.selectTotalNumber();
            return result;
        } finally {
            DBTools.closeSession();
        }
    }
}
