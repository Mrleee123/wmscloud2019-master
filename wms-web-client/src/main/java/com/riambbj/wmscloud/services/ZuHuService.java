package com.riambbj.wmscloud.services;

import dao.ZuHuDao;
import entity.ZuHu;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ZuHuService {
    @Autowired
    ZuHuDao dao = new ZuHuDao();

    public int insertZuHuInfo(ZuHu ZuHu) {
        return dao.add(ZuHu);
    }

    public int deleteZuHuById(int id) {
        return dao.delete(id);
    }

    public int updateZuHuInfo(ZuHu ZuHu) {
        return dao.update(ZuHu);
    }

    public ZuHu selectZuHuByid(int id) {
        return dao.get(id);
    }


    public List<ZuHu> selectByMore(ZuHu ZuHu, int currPage, int pageSize) {
        List<ZuHu> list = dao.selectByMore(ZuHu);
        int firstIndex = (currPage - 1) * pageSize;
        int lastIndex = currPage * pageSize;
        return list.subList(firstIndex, lastIndex);
    }
}