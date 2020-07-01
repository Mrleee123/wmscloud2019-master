package dao;

import dbtools.DBTools;
import entity.ZuHuService;
import mappers.ZuHuServiceMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class ZuHuServiceDao {
    private SqlSession sqlSession;
    private ZuHuServiceMapper mapper;

    public ZuHuServiceDao() {
        sqlSession = DBTools.getSession();
        mapper = sqlSession.getMapper(ZuHuServiceMapper.class);
    }

    public int add(ZuHuService matdet) {
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

    public int update(ZuHuService ZuHuService) {
        try {

            int result = mapper.updateByPrimaryKeySelective(ZuHuService);
            sqlSession.commit();
            return result;
        } finally {
            DBTools.closeSession();
        }
    }

    public ZuHuService get(int id) {
        try {
            ZuHuService matdet = mapper.selectByPrimaryKey(id);
            System.out.println(matdet);
            return matdet;
        } finally {
            DBTools.closeSession();
        }
    }


    public List<ZuHuService> selectByMore(ZuHuService ZuHuService) {
        try {
            List<ZuHuService> result = mapper.selectByMore(ZuHuService);
            return result;
        } finally {
            DBTools.closeSession();
        }
    }
}
