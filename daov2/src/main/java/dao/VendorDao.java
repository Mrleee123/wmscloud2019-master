package dao;

import dbtools.DBTools;
import entity.Vendor;
import mappers.VendorMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class VendorDao {
    private SqlSession sqlSession;
    private VendorMapper mapper;

    public VendorDao() {
        sqlSession = DBTools.getSession();
        mapper = sqlSession.getMapper(VendorMapper.class);
    }

    public int add(Vendor vendor) {
        try {
            int result = mapper.insert(vendor);
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

    public int update(Vendor vendor) {
        try {
            int result = mapper.updateByPrimaryKeySelective(vendor);
            sqlSession.commit();
            return result;
        } finally {
            DBTools.closeSession();
        }
    }

    public Vendor get(long id) {
        try {
            Vendor vendor = mapper.selectByPrimaryKey(id);
            System.out.println(vendor);
            return vendor;
        } finally {
            DBTools.closeSession();
        }
    }

    public List<Vendor> list() {
        try {
            // Matmain matmain = new Matmain();
            List<Vendor> list = mapper.selectAll();
            System.out.println(list);
            return list;
        } finally {
            DBTools.closeSession();
        }
    }

    public List<Vendor> selectByMore(Vendor vendor) {
        try {
            List<Vendor> result = mapper.selectByMore(vendor);
            System.out.println(result);
            return result;
        } finally {
            DBTools.closeSession();
        }
    }
}



