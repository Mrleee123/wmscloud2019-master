package dao;


import dbtools.DBTools;
import entity.Role;
import mappers.RoleMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class RoleDao {
    private SqlSession sqlSession;
    private RoleMapper mapper;

    public RoleDao() {
        sqlSession = DBTools.getSession();

        mapper = sqlSession.getMapper(RoleMapper.class);

    }

    public int add(Role entity)  {
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

    public int update(Role entity)  {
        try {
            int result = mapper.updateByPrimaryKeySelective(entity);
            sqlSession.commit();
            return result;
        } finally {
            DBTools.closeSession();
           // sqlSession.close();
        }
    }

    public Role get(int id)  {
        try {
            Role result = mapper.selectByPrimaryKey(id);
            System.out.println(result);
            return result;
        }
        finally {
            DBTools.closeSession();
            //sqlSession.close();
        }
    }

    public List<Role> list() {
        try {
            List<Role> result = mapper.selectAll();
            System.out.println(result);
            return result;
        } finally {
            DBTools.closeSession();
            //sqlSession.close();
        }
    }

    public int forbiddenRoleById(int id){
        try{
            int result = mapper.forbiddenRoleById(id);
            sqlSession.commit();
            return result;
        }
        finally {
            DBTools.closeSession();
        }
    }

    public int enableRoleById(int id){
        try{
            int result = mapper.enableRoleById(id);
            sqlSession.commit();
            return result;
        }
        finally {
            DBTools.closeSession();
        }
    }

    public List<Role> selectByMore(Role role)  {
        try {
            List<Role> result = mapper.selectByMore(role);
            System.out.println(result);
            return result;
        }
        finally {
            DBTools.closeSession();
            //sqlSession.close();
        }
    }
}