package dao;

import dbtools.DBTools;
import entity.Compare;
import entity.DevLog;
import entity.RackSum;
import mappers.DevLogMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.Date;
import java.util.List;
import java.util.Map;

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


    public List<DevLog> selectMore(DevLog devLog) {
        try {
            List<DevLog> result = mapper.selectByMore(devLog);
            return result;
        } finally {
            DBTools.closeSession();
        }
    }

        public List<Map> selectByDev(String Devno) {
            try {
                List<Map> map= mapper.selectByDev(Devno);
                return map;
            } finally {
                DBTools.closeSession();
            }
        }

    public List<Map> selectByDevAndCompany( String Devno, Integer companyid) {
        try {
            List<Map> map= mapper.selectByDevAndCompany(Devno,companyid);
            return map;
        } finally {
            DBTools.closeSession();
        }
    }

    public List<DevLog> selectCompare( List<Compare> compare) {
        try {
            List<DevLog> devLogs= mapper.selectCompare(compare);
            return devLogs;
        } finally {
            DBTools.closeSession();
        }
    }


    public List<RackSum> selectByStatus(int companyid, Date ltime){
        try {
            List<RackSum> result = mapper.selectByStatus(companyid,ltime);
            System.out.println(result);
            return result;
        }finally {
            DBTools.closeSession();
        }
    }

    public List<RackSum> selectByStatusAll( Date ltime){
        try {
            List<RackSum> result = mapper.selectByStatusAll(ltime);
            System.out.println(result);
            return result;
        }finally {
            DBTools.closeSession();
        }
    }
}


