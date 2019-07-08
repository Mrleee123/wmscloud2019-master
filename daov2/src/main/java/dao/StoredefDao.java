package dao;

import dbtools.DBTools;
import entity.Storedef;
import mappers.StoredefMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.Date;
import java.util.List;

public class StoredefDao {
    private SqlSession sqlSession;
    private StoredefMapper mapper;

    public StoredefDao() {
        sqlSession = DBTools.getSession();
        mapper = sqlSession.getMapper(StoredefMapper.class);
    }

    public int add(Storedef storedef) {
        try {
            int result = mapper.insert(storedef);
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

    public int update(Storedef storedef) {
        try {
            java.sql.Date time = new java.sql.Date(new Date().getTime());
            Date update_time = time;
            storedef.setUpdateTime(update_time);
            int result = mapper.updateByPrimaryKeySelective(storedef);
            sqlSession.commit();
            return result;
        } finally {
            DBTools.closeSession();
        }
    }

    public Storedef get(long id) {
        try {
            Storedef storedef = mapper.selectByPrimaryKey(id);
            System.out.println(storedef);
            return storedef;
        } finally {
            DBTools.closeSession();
        }
    }

    public List<Storedef> list() {
        try {
            // Matmain matmain = new Matmain();
            List<Storedef> list = mapper.selectAll();
            System.out.println(list);
            return list;
        } finally {
            DBTools.closeSession();
        }
    }

    public List<Storedef> selectByMore(Storedef storedef) {
        try {

            List<Storedef> result = mapper.selectByMore(storedef);
            System.out.println(result);
            return result;
        } finally {
            DBTools.closeSession();
        }
    }
}





