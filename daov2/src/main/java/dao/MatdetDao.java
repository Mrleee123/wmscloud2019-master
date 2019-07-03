package dao;

import dbtools.DBTools;
import entity.Matdet;
import mappers.MatdetMapper;
import mappers.MatmainMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.Date;
import java.util.List;

public class MatdetDao {
    private SqlSession sqlSession;
    private MatdetMapper mapper;

    public MatdetDao() {
        sqlSession = DBTools.getSession();
        mapper = sqlSession.getMapper(MatdetMapper.class);
    }

    public int add(Matdet matdet) {
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

    public int update(Matdet matdet) {
        try {
            java.sql.Date time = new java.sql.Date(new Date().getTime());
            Date update_time = time;
            matdet.setUpdateTime(update_time);
            int result = mapper.updateByPrimaryKeySelective(matdet);
            sqlSession.commit();
            return result;
        } finally {
            DBTools.closeSession();
        }
    }

    public Matdet get(long id) {
        try {
            Matdet matdet = mapper.selectByPrimaryKey(id);
            System.out.println(matdet);
            return matdet;
        } finally {
            DBTools.closeSession();
        }
    }

    public List<Matdet> list() {
        try {
            // Matmain matmain = new Matmain();
            List<Matdet> list = mapper.selectAll();
            System.out.println(list);
            return list;
        } finally {
            DBTools.closeSession();
        }
    }
}



