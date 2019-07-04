package dao;

import dbtools.DBTools;
import entity.Rack;
import mappers.RackMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.Date;
import java.util.List;

public class RackDao {
    private SqlSession sqlSession;
    private RackMapper mapper;

    public RackDao() {
        sqlSession = DBTools.getSession();
        mapper = sqlSession.getMapper(RackMapper.class);
    }

    public int add(Rack rack) {
        try {
            int result = mapper.insert(rack);
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

    public int update(Rack rack) {
        try {
            int result = mapper.updateByPrimaryKeySelective(rack);
            sqlSession.commit();
            return result;
        } finally {
            DBTools.closeSession();
        }
    }

    public Rack get(long id) {
        try {
            Rack rack = mapper.selectByPrimaryKey(id);
            System.out.println(rack);
            return rack;
        } finally {
            DBTools.closeSession();
        }
    }

//    public List<Rack> list() {
//        try {
//            // Matmain matmain = new Matmain();
//            List<Rack> list = mapper.s();
//            System.out.println(list);
//            return list;
//        } finally {
//            DBTools.closeSession();
//        }
  //  }
}
