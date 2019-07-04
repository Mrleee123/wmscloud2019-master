package mappers;

import entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    /**
     * 添加用户
     * 和xml里面的mapper一一对应
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

    public User login(@Param("user_code")String user_code,  @Param("password")String password);

    public int forbiddenUserById(long id);

    public int enableUserById(long id);

    User selectByUserCode(String userCode);
}