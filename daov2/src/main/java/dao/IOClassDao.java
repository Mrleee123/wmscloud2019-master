package dao;

import dbtools.DBTools;
import entity.IOClass;
import mappers.IOClassMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.Date;
import java.util.List;

public class IOClassDao {
    private SqlSession sqlSession;
    private IOClassMapper mapper;

    public IOClassDao() {
        sqlSession = DBTools.getSession();
        mapper = sqlSession.getMapper(IOClassMapper.class);
    }

    public int add(IOClass ioClass) {
        try {
            int result = mapper.insert(ioClass);
            sqlSession.commit();
            return result;
        } finally {
            DBTools.closeSession();
        }
    }

    public int delete(int id) {
        try {
            int result = mapper.deleteByPrimaryKey(id);
            sqlSession.commit();
            return result;
        } finally {
            DBTools.closeSession();
        }
    }

    public int update(IOClass ioClass) {
        try {
            java.sql.Date time = new java.sql.Date(new Date().getTime());
            Date update_time = time;
            ioClass.setUpdateTime(update_time);
            int result = mapper.updateByPrimaryKeySelective(ioClass);
            sqlSession.commit();
            return result;
        } finally {
            DBTools.closeSession();
        }
    }

    public IOClass get(int id) {
        try {
            IOClass ioClass = mapper.selectByPrimaryKey(id);
            System.out.println(ioClass);
            return ioClass;
        } finally {
            DBTools.closeSession();
        }
    }
    

    public List<IOClass> selectByMore(IOClass ioClass) {
        try {
            List<IOClass> result = mapper.selectByMore(ioClass);
            return result;
        } finally {
            DBTools.closeSession();
        }
    }
}



