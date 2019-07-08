package mappers;

import entity.Role;


import java.util.List;

public interface RoleMapper {
    int deleteByPrimaryKey(int id);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(int id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);

    List<Role> selectAll();

    int forbiddenRoleById(int id);

    int enableRoleById(int id);

    List<Role> selectByMore(Role role);
}