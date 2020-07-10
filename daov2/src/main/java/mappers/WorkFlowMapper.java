package mappers;

import entity.RackSum;
import entity.WorkFlow;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface WorkFlowMapper {
    int deleteByPrimaryKey(Long id);

    int insert(WorkFlow record);

    int insertSelective(WorkFlow record);

    WorkFlow selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WorkFlow record);

    int updateByPrimaryKey(WorkFlow record);

    List<WorkFlow> selectByMore(WorkFlow record);

    int selectTotalNumber();

    int selectTotalNumberByCompany(Integer companyid);

    List<RackSum> selectByStatus(@Param("companyId") int companyid, @Param("ltime") Date ltime);

    List<RackSum> selectByStatusAll( @Param("ltime") Date ltime);
}