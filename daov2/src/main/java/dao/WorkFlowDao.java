package dao;

import dbtools.DBTools;
import entity.WorkFlow;
import mappers.WorkFlowMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.Date;
import java.util.List;

public class WorkFlowDao {
    private SqlSession sqlSession;
    private WorkFlowMapper mapper;

    public WorkFlowDao() {
        sqlSession = DBTools.getSession();
        mapper = sqlSession.getMapper(WorkFlowMapper.class);
    }

    public int add(WorkFlow matdet) {
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

    public int update(WorkFlow WorkFlow) {
        try {
            java.sql.Date time = new java.sql.Date(new Date().getTime());
            Date update_time = time;
            WorkFlow.setLtime(update_time);
            int result = mapper.updateByPrimaryKeySelective(WorkFlow);
            sqlSession.commit();
            return result;
        } finally {
            DBTools.closeSession();
        }
    }

    public WorkFlow get(long id) {
        try {
            WorkFlow matdet = mapper.selectByPrimaryKey(id);
            System.out.println(matdet);
            return matdet;
        } finally {
            DBTools.closeSession();
        }
    }


    public List<WorkFlow> selectByMore(WorkFlow workFlow) {
        try {
            List<WorkFlow> result = mapper.selectByMore(workFlow);
            return result;
        } finally {
            DBTools.closeSession();
        }
    }
}
