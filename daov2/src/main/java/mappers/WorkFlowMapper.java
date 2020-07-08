package mappers;

import entity.WorkFlow;

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
}