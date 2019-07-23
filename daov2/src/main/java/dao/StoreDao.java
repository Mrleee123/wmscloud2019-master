package dao;

import dbtools.DBTools;
import entity.Store;
import mappers.StoreMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class StoreDao {
    private SqlSession sqlSession;
    private StoreMapper mapper;

    public StoreDao() {
        sqlSession = DBTools.getSession();
        mapper = sqlSession.getMapper(StoreMapper.class);
    }

    public int add(Store store) {
        try {
            int result = mapper.insert(store);
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

    public int update(Store store) {
        try {

            int result = mapper.updateByPrimaryKeySelective(store);
            sqlSession.commit();
            return result;
        } finally {
            DBTools.closeSession();
        }
    }

    public Store get(int id) {
        try {
            Store store = mapper.selectByPrimaryKey(id);
            System.out.println(store);
            return store;
        } finally {
            DBTools.closeSession();
        }
    }


    public List<Store> selectByMore(Store store) {
        try {
            List<Store> result = mapper.selectByMore(store);
            return result;
        } finally {
            DBTools.closeSession();
        }
    }
}
