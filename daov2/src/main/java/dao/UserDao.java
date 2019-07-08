package dao;


import dbtools.DBTools;
import entity.User;
import mappers.UserMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;

import java.util.Date;
import java.util.List;

public class UserDao {
    private SqlSession sqlSession;
    private UserMapper mapper;

    public UserDao() {
        sqlSession = DBTools.getSession();

        mapper = sqlSession.getMapper(UserMapper.class);

    }

    public int add(User entity)  {
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

    public int delete(long id)  {
        try {
            int result = mapper.deleteByPrimaryKey(id);
            sqlSession.commit();
            return result;
        } finally {
            DBTools.closeSession();
            //sqlSession.close();
        }
    }

    public int update(User entity)  {
        try {
            java.sql.Date time = new java.sql.Date(new Date().getTime());
            Date update_time = time;
            entity.setUpdateTime(update_time);
            int result = mapper.updateByPrimaryKeySelective(entity);
            sqlSession.commit();
            return result;
        } finally {
            DBTools.closeSession();
           // sqlSession.close();
        }
    }

    public User get(long id)  {
        try {
            User result = mapper.selectByPrimaryKey(id);
            System.out.println(result);
            return result;
        }
        finally {
            DBTools.closeSession();
            //sqlSession.close();
        }
    }

    public List<User> list() {
        try {
            List<User> result = mapper.selectAll();
            System.out.println(result);
            return result;
        } finally {
            DBTools.closeSession();
            //sqlSession.close();
        }
    }

    public  User selectByUserCode(String userCode){
        try{
            User user = new User();
            user = mapper.selectByUserCode(userCode);
            System.out.println(user);
            return user;
        }finally {
            DBTools.closeSession();
        }
    }


    public  User loginByCodeAndPwd(String User_code,String password){
        try{
            User user = new User();
            user = mapper.login(User_code,password);
            System.out.println(user);
            return user;
        }finally {
            DBTools.closeSession();
        }
    }

    public int forbiddenUser(long id){
        try{
            int result = mapper.forbiddenUserById(id);
            sqlSession.commit();
            return result;
        }finally {
            DBTools.closeSession();
        }
    }

    public int enableUserById(long id){
        try{
            int result = mapper.enableUserById(id);
            sqlSession.commit();
            return result;
        }finally {
            DBTools.closeSession();
        }
    }

    public List<User> selectByMore(User user){
        try {
            List<User> result = mapper.selectByMore(user);
            System.out.println(result);
            return result;
        }finally {
            DBTools.closeSession();
        }
    }
}