package dao;
import dbtools.DBTools;
import entity.User;
import mappers.UserMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class UserDao {
    private SqlSession sqlSession;
    private UserMapper mapper;

    public UserDao() {
        sqlSession = DBTools.getSqlSession();
        mapper = sqlSession.getMapper(UserMapper.class);
    }

    public int add(User entity) throws Exception {
        //调用数据库操作函数后需要commit才会提交
        int result = mapper.insert(entity);
        sqlSession.commit();
        return result;
    }

    public int delete(long id) throws Exception {
        int result = mapper.deleteByPrimaryKey(id);
        sqlSession.commit();
        return result;
    }

    public int update(User entity) throws Exception {
        int result = mapper.updateByPrimaryKey(entity);
        sqlSession.commit();
        return result;
    }

    public User get(long id) throws Exception {
        User result = mapper.selectByPrimaryKey(id);
        sqlSession.commit();
        return result;
    }

    public List<User> list() throws Exception {
        List<User> result = mapper.selectAll();
        sqlSession.commit();
        System.out.println(result);
        return result;
    }
}