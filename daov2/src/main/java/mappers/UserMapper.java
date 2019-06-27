package mappers;

import entity.User;

import java.util.List;

public interface UserMapper {
    /**
     * 添加用户
     *
     * @param entity 实体
     * @return 添加id
     * @throws Exception
     */
    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    public List<User> selectAll();

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}