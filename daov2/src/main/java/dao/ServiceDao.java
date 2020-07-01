package dao;

import dbtools.DBTools;
import entity.Service;
import mappers.ServiceMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.Date;
import java.util.List;

public class ServiceDao {
    private SqlSession sqlSession;
    private ServiceMapper mapper;

    public ServiceDao() {
        sqlSession = DBTools.getSession();
        mapper = sqlSession.getMapper(ServiceMapper.class);
    }

    public int add(Service matdet) {
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

    public int update(Service Service) {
        try {
            java.sql.Date time = new java.sql.Date(new Date().getTime());
            Date update_time = time;
            Service.setUpdateTime(update_time);
            int result = mapper.updateByPrimaryKeySelective(Service);
            sqlSession.commit();
            return result;
        } finally {
            DBTools.closeSession();
        }
    }

    public Service get(long id) {
        try {
            Service matdet = mapper.selectByPrimaryKey(id);
            System.out.println(matdet);
            return matdet;
        } finally {
            DBTools.closeSession();
        }
    }


    public List<Service> selectByMore(Service Service) {
        try {
            List<Service> result = mapper.selectByMore(Service);
            return result;
        } finally {
            DBTools.closeSession();
        }
    }
}
