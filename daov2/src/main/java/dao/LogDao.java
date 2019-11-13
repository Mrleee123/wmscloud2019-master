package dao;

import dbtools.DBTools;
import entity.Log;
import mappers.LogMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.Date;
import java.util.List;

public class LogDao {
    private SqlSession sqlSession;
    private LogMapper mapper;

    public LogDao() {
        sqlSession = DBTools.getSession();
        mapper = sqlSession.getMapper(LogMapper.class);
    }

    public int add(Log matdet) {
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

    public int update(Log log) {
        try {
            java.sql.Date time = new java.sql.Date(new Date().getTime());
            Date update_time = time;
            log.setLtime(update_time);
            int result = mapper.updateByPrimaryKeySelective(log);
            sqlSession.commit();
            return result;
        } finally {
            DBTools.closeSession();
        }
    }

    public Log get(long id) {
        try {
            Log matdet = mapper.selectByPrimaryKey(id);
            System.out.println(matdet);
            return matdet;
        } finally {
            DBTools.closeSession();
        }
    }


    public List<Log> selectByMore(Log matdet) {
        try {
            List<Log> result = mapper.selectByMore(matdet);
            return result;
        } finally {
            DBTools.closeSession();
        }
    }
}
