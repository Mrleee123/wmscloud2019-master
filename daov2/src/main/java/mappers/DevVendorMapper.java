package mappers;

import entity.DevVendor;

public interface DevVendorMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DevVendor record);

    int insertSelective(DevVendor record);

    DevVendor selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DevVendor record);

    int updateByPrimaryKey(DevVendor record);
}