package mappers;

import entity.Service;

import java.util.List;

public interface ServiceMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Service record);

    int insertSelective(Service record);

    Service selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Service record);

    int updateByPrimaryKey(Service record);

    List<Service> selectByMore(Service record);

    List<Service> selectByCompanyId(int companynyid);
}