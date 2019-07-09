package mappers;

import entity.Rack;

import java.util.List;

public interface RackMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Rack record);

    int insertSelective(Rack record);

    Rack selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Rack record);

    int updateByPrimaryKey(Rack record);

    List<Rack> selectByMore(Rack rack);
}