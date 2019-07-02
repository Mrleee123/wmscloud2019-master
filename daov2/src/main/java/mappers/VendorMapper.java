package mappers;

import entity.Vendor;

public interface VendorMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Vendor record);

    int insertSelective(Vendor record);

    Vendor selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Vendor record);

    int updateByPrimaryKey(Vendor record);
}