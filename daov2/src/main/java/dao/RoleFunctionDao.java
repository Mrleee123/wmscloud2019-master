package dao;


import dbtools.DBTools;
import entity.RoleFunction;
import mappers.RoleFunctionMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.Date;
import java.util.List;

public class RoleFunctionDao {
    private SqlSession sqlSession;
    private RoleFunctionMapper mapper;

    public RoleFunctionDao() {
        sqlSession = DBTools.getSession();

        mapper = sqlSession.getMapper(RoleFunctionMapper.class);

    }

    public int add(RoleFunction entity)  {
        //调用数据库操作函数后需要commit才会提交
        try {
            int result = mapper.insert(entity);
            sqlSession.commit();
            return result;
        } finally {
            DBTools.closeSession();
           // sqlSession.close();
        }
    }

    public int delete(int id)  {
        try {
            int result = mapper.deleteByPrimaryKey(id);
            sqlSession.commit();
            return result;
        } finally {
            DBTools.closeSession();
            //sqlSession.close();
        }
    }

    public int update(RoleFunction entity)  {
        try {
            java.sql.Date time = new java.sql.Date(new Date().getTime());
            Date updateTime = time;
            entity.setUpdateTime(updateTime);
            int result = mapper.updateByPrimaryKeySelective(entity);
            sqlSession.commit();
            return result;
        } finally {
            DBTools.closeSession();
           // sqlSession.close();
        }
    }

    public RoleFunction get(int id)  {
        try {
            RoleFunction result = mapper.selectByPrimaryKey(id);
            System.out.println(result);
            return result;
        }
        finally {
            DBTools.closeSession();
            //sqlSession.close();
        }
    }

    public List<RoleFunction> list() {
        try {
            List<RoleFunction> result = mapper.selectAll();
            System.out.println(result);
            return result;
        } finally {
            DBTools.closeSession();
            //sqlSession.close();
        }
    }

    public int insertList(List<RoleFunction> roleFunctionList){
        try {
            int result = mapper.insertList(roleFunctionList);
            sqlSession.commit();
            return result;
        } finally {
            DBTools.closeSession();
            // sqlSession.close();
        }
    }

    public int deleteList(List list){
        try {
            int result = mapper.deleteList(list);
            sqlSession.commit();
            return result;
        } finally {
            DBTools.closeSession();
            // sqlSession.close();
        }
    }

}