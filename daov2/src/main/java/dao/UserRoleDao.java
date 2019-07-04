package dao;

import dbtools.DBTools;
import entity.UserRole;
import mappers.UserRoleMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class UserRoleDao {
    private SqlSession sqlSession;
    private UserRoleMapper mapper;

    public UserRoleDao() {
        sqlSession = DBTools.getSession();
        mapper = sqlSession.getMapper(UserRoleMapper.class);
    }

    public int add(UserRole userRole) {
        try {
            int result = mapper.insert(userRole);
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

    public int update(UserRole userRole) {
        try {
            int result = mapper.updateByPrimaryKeySelective(userRole);
            sqlSession.commit();
            return result;
        } finally {
            DBTools.closeSession();
        }
    }

    public List<UserRole> get(long id) {
        try {
            List<UserRole> userRole = mapper.selectByPrimaryKey(id);
            System.out.println(userRole);
            return userRole;
        } finally {
            DBTools.closeSession();
        }
    }

//    public List<UserRole> list() {
//        try {
//            // Matmain matmain = new Matmain();
//            List<UserRole> list = mapper.selectAll();
//            System.out.println(list);
//            return list;
//        } finally {
//            DBTools.closeSession();
//        }
//    }
}
