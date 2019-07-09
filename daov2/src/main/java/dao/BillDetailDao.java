package dao;

import dbtools.DBTools;
import entity.BillDetail;
import mappers.BillDetailMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class BillDetailDao {
    private SqlSession sqlSession;
    private BillDetailMapper mapper;

    public BillDetailDao() {
        sqlSession = DBTools.getSession();
        mapper = sqlSession.getMapper(BillDetailMapper.class);
    }

    public int add(BillDetail billDetail) {
        try {
            int result = mapper.insert(billDetail);
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

    public int update(BillDetail billDetail) {
        try {

            int result = mapper.updateByPrimaryKeySelective(billDetail);
            sqlSession.commit();
            return result;
        } finally {
            DBTools.closeSession();
        }
    }

    public BillDetail get(long id) {
        try {
            BillDetail billDetail = mapper.selectByPrimaryKey(id);
            System.out.println(billDetail);
            return billDetail;
        } finally {
            DBTools.closeSession();
        }
    }


    public List<BillDetail> selectByMore(BillDetail billDetail) {
        try {
            List<BillDetail> result = mapper.selectByMore(billDetail);
            return result;
        } finally {
            DBTools.closeSession();
        }
    }
}



