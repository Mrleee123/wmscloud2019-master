package dao;

import dbtools.DBTools;
import entity.ZuHu;
import mappers.ZuHuMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class ZuHuDao {
    private SqlSession sqlSession;
    private ZuHuMapper mapper;

    public ZuHuDao() {
        sqlSession = DBTools.getSession();
        mapper = sqlSession.getMapper(ZuHuMapper.class);
    }

    public int add(ZuHu matdet) {
        try {
            int result = mapper.insert(matdet);
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

    public int update(ZuHu ZuHu) {
        try {

            int result = mapper.updateByPrimaryKeySelective(ZuHu);
            sqlSession.commit();
            return result;
        } finally {
            DBTools.closeSession();
        }
    }

    public ZuHu get(int id) {
        try {
            ZuHu matdet = mapper.selectByPrimaryKey(id);
            System.out.println(matdet);
            return matdet;
        } finally {
            DBTools.closeSession();
        }
    }


    public List<ZuHu> selectByMore(ZuHu ZuHu) {
        try {
            List<ZuHu> result = mapper.selectByMore(ZuHu);
            return result;
        } finally {
            DBTools.closeSession();
        }
    }
}

