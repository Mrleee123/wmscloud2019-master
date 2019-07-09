package mappers;

import entity.IOClass;

import java.util.List;

public interface IOClassMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(IOClass record);

    int insertSelective(IOClass record);

    IOClass selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(IOClass record);

    int updateByPrimaryKey(IOClass record);

    List<IOClass> selectByMore(IOClass ioClass);
}