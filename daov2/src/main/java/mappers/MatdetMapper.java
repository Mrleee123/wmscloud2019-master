package mappers;

import entity.Matdet;
import entity.RackSum;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface MatdetMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Matdet record);

    int insertSelective(Matdet record);

    Matdet selectByPrimaryKey(Long id);

    List<Matdet> selectAll();

    int updateByPrimaryKeySelective(Matdet record);

    int updateByPrimaryKey(Matdet record);

    List<Matdet> selectByMore(Matdet matdet);

    List<RackSum> selectByStatus(@Param("companyId") int companyid, @Param("createTime") Date ltime);
}