package mappers;

import entity.Compare;
import entity.DevLog;
import entity.RackSum;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface DevLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DevLog record);

    int insertSelective(DevLog record);

    DevLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DevLog record);

    int updateByPrimaryKey(DevLog record);

    List<DevLog> selectByMore(DevLog record);

    List<Map> selectByDev(String Devno);

    List<Map> selectByDevAndCompany(@Param("devno") String Devno, @Param("companyId") Integer companyid);

    List<DevLog> selectCompare(@Param("Compare") List<Compare> compare);

    List<DevLog> selectMore(DevLog record);

    List<RackSum> selectByStatus(@Param("companyId") int companyid, @Param("ltime") Date ltime);

    List<RackSum> selectByStatusAll( @Param("ltime") Date ltime);

}