package mappers;

import entity.RoleFunction;

import java.util.List;

public interface RoleFunctionMapper {
    int deleteByPrimaryKey(int id);

    int insert(RoleFunction record);

    int insertSelective(RoleFunction record);

    RoleFunction selectByPrimaryKey(int id);

    int updateByPrimaryKeySelective(RoleFunction record);

    int updateByPrimaryKey(RoleFunction record);

    List<RoleFunction> selectAll();

    int insertList(List<RoleFunction> record);

    int deleteList(List list);
}