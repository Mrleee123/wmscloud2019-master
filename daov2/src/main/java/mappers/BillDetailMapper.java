package mappers;

import entity.BillDetail;

import java.util.List;

public interface BillDetailMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BillDetail record);

    int insertSelective(BillDetail record);

    BillDetail selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BillDetail record);

    int updateByPrimaryKey(BillDetail record);

    List<BillDetail> selectByMore(BillDetail billHead);
}