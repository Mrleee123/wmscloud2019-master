package dao;

import dbtools.DBTools;
import entity.DevLog;
import mappers.DevLogMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.Date;
import java.util.List;

public class DveLogDao {

        private SqlSession sqlSession;
        private DevLogMapper mapper;

        public DveLogDao() {
            sqlSession = DBTools.getSession();
            mapper = sqlSession.getMapper(DevLogMapper.class);
        }

        public int add(DevLog matdet) {
            try {
                int result = mapper.insert(matdet);
                sqlSession.commit();
                return result;
            } finally {
                DBTools.closeSession();
            }
        }

        public int delete(int id) {
            try {
                int result = mapper.deleteByPrimaryKey(id);
                sqlSession.commit();
                return result;
            } finally {
                DBTools.closeSession();
            }
        }

        public int update(DevLog log) {
            try {
                java.sql.Date time = new java.sql.Date(new Date().getTime());
                Date update_time = time;
                log.setLtime(update_time);
                int result = mapper.updateByPrimaryKeySelective(log);
                sqlSession.commit();
                return result;
            } finally {
                DBTools.closeSession();
            }
        }

        public DevLog get(int id) {
            try {
                DevLog matdet = mapper.selectByPrimaryKey(id);
                System.out.println(matdet);
                return matdet;
            } finally {
                DBTools.closeSession();
            }
        }


        public List<DevLog> selectByMore(DevLog devLog) {
            try {
                List<DevLog> result = mapper.selectByMore(devLog);
                return result;
            } finally {
                DBTools.closeSession();
            }
        }
    }


