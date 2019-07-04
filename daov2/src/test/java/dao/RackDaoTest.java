package dao;

import entity.Rack;
import org.junit.Test;

import static org.junit.Assert.*;

public class RackDaoTest {
    RackDao dao = new RackDao();
    @Test
    public void add() {
        Rack rack = new Rack();
        rack.setStoredefId(1);
        rack.setCid("1-1-1-1");
        rack.setCellcode("N");
        rack.setPalletid("10086");
        rack.setAisle(1);
        rack.setLayer(1);
        rack.setRank(1);
        rack.setRoww(1);
        rack.setStatus("E");
        dao.add(rack);
    }

    @Test
    public void delete() {
    }

    @Test
    public void update() {
    }

    @Test
    public void get() {
    }
}