package mappers;

import entity.ZuHuService;

public interface ZuHuServiceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ZuHuService record);

    int insertSelective(ZuHuService record);

    ZuHuService selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ZuHuService record);

    int updateByPrimaryKey(ZuHuService record);
}