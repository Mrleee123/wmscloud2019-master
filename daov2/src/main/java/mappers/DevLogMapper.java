package mappers;

import entity.DevLog;

import java.util.List;

public interface DevLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DevLog record);

    int insertSelective(DevLog record);

    DevLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DevLog record);

    int updateByPrimaryKey(DevLog record);

    List<DevLog> selectByMore(DevLog record);
}