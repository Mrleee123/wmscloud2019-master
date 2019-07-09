package dao;

import dbtools.DBTools;
import entity.BillHead;
import mappers.BillHeadMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class BillHeadDao {
    private SqlSession sqlSession;
    private BillHeadMapper mapper;

    public BillHeadDao() {
        sqlSession = DBTools.getSession();
        mapper = sqlSession.getMapper(BillHeadMapper.class);
    }

    public int add(BillHead billHead) {
        try {
            int result = mapper.insert(billHead);
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

    public int update(BillHead billHead) {
        try {

            int result = mapper.updateByPrimaryKeySelective(billHead);
            sqlSession.commit();
            return result;
        } finally {
            DBTools.closeSession();
        }
    }

    public BillHead get(long id) {
        try {
            BillHead billHead = mapper.selectByPrimaryKey(id);
            System.out.println(billHead);
            return billHead;
        } finally {
            DBTools.closeSession();
        }
    }


    public List<BillHead> selectByMore(BillHead billHead) {
        try {
            List<BillHead> result = mapper.selectByMore(billHead);
            return result;
        } finally {
            DBTools.closeSession();
        }
    }
}



