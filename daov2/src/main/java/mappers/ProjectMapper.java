package mappers;

import entity.Project;

import java.util.List;

public interface ProjectMapper {
    int deleteByPrimaryKey(long id);

    int insert(Project record);

    int insertSelective(Project record);

    Project selectByPrimaryKey(long id);

    int updateByPrimaryKeySelective(Project record);

    int updateByPrimaryKey(Project record);

    List<Project> selectByMore(Project record);

    int selectTotalNumber();
}