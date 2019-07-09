package mappers;

import entity.BillHead;

import java.util.List;

public interface BillHeadMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BillHead record);

    int insertSelective(BillHead record);

    BillHead selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BillHead record);

    int updateByPrimaryKey(BillHead record);

    List<BillHead> selectByMore(BillHead billHead);
}