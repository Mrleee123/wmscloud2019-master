package mappers;

import entity.ZuHu;

import java.util.List;

public interface ZuHuMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ZuHu record);

    int insertSelective(ZuHu record);

    ZuHu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ZuHu record);

    int updateByPrimaryKey(ZuHu record);

    List<ZuHu> selectByMore(ZuHu record);
}