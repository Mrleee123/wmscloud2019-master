package dao;

import dbtools.DBTools;
import entity.Matmain;
import mappers.MatmainMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class MatMainDao {
    private SqlSession sqlSession;
    private MatmainMapper mapper;

    public MatMainDao() {
        sqlSession = DBTools.getSession();
        mapper = sqlSession.getMapper(MatmainMapper.class);
    }

    public int add(Matmain matmain){
        try{
            int result = mapper.insert(matmain);
            sqlSession.commit();
            return result;
        }finally {
            DBTools.closeSession();
        }
    }

    public int delete(int id){
        try{
            int result = mapper.deleteByPrimaryKey(id);
            sqlSession.commit();
            return result;
        }finally {
            DBTools.closeSession();
        }
    }

    public int update(Matmain matmain){
        try{
            int result = mapper.updateByPrimaryKeySelective(matmain);
            sqlSession.commit();
            return result;
        }finally {
            DBTools.closeSession();
        }
    }

    public Matmain get(int id){
        try{
            Matmain matmain = mapper.selectByPrimaryKey(id);
            System.out.println(matmain);
            return matmain;
        }finally {
            DBTools.closeSession();
        }
    }

    public List<Matmain> list(){
        try {
           // Matmain matmain = new Matmain();
            List<Matmain> list = mapper.selectAll();
            System.out.println(list);
            return list;
        }finally {
            DBTools.closeSession();
        }
    }

    public List<Matmain> selectByMore(Matmain matmain){
        try{
            List<Matmain> result = mapper.selectByMore(matmain);
            System.out.println(result);
            return result;
        }finally {
            DBTools.closeSession();
        }
    }
}
