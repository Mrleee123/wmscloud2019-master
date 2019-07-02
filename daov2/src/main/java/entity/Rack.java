package com.model;

import java.io.Serializable;
import java.util.Date;

public class Rack implements Serializable {
    private Long id;

    private Integer storedefId;

    private String cid;

    private String cellcode;

    private String palletid;

    private Integer aisle;

    private Integer layer;

    private Integer rank;

    private Integer roww;

    private String status;

    private Date lasttime;

    private String plattype;

    private String cellclass;

    private String spalletid;

    private String lpalletid;

    private String cpalletid;

    private String xpalletid;

    private String memo;

    private Integer issys;

    private String worktype;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getStoredefId() {
        return storedefId;
    }

    public void setStoredefId(Integer storedefId) {
        this.storedefId = storedefId;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid == null ? null : cid.trim();
    }

    public String getCellcode() {
        return cellcode;
    }

    public void setCellcode(String cellcode) {
        this.cellcode = cellcode == null ? null : cellcode.trim();
    }

    public String getPalletid() {
        return palletid;
    }

    public void setPalletid(String palletid) {
        this.palletid = palletid == null ? null : palletid.trim();
    }

    public Integer getAisle() {
        return aisle;
    }

    public void setAisle(Integer aisle) {
        this.aisle = aisle;
    }

    public Integer getLayer() {
        return layer;
    }

    public void setLayer(Integer layer) {
        this.layer = layer;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Integer getRoww() {
        return roww;
    }

    public void setRoww(Integer roww) {
        this.roww = roww;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getLasttime() {
        return lasttime;
    }

    public void setLasttime(Date lasttime) {
        this.lasttime = lasttime;
    }

    public String getPlattype() {
        return plattype;
    }

    public void setPlattype(String plattype) {
        this.plattype = plattype == null ? null : plattype.trim();
    }

    public String getCellclass() {
        return cellclass;
    }

    public void setCellclass(String cellclass) {
        this.cellclass = cellclass == null ? null : cellclass.trim();
    }

    public String getSpalletid() {
        return spalletid;
    }

    public void setSpalletid(String spalletid) {
        this.spalletid = spalletid == null ? null : spalletid.trim();
    }

    public String getLpalletid() {
        return lpalletid;
    }

    public void setLpalletid(String lpalletid) {
        this.lpalletid = lpalletid == null ? null : lpalletid.trim();
    }

    public String getCpalletid() {
        return cpalletid;
    }

    public void setCpalletid(String cpalletid) {
        this.cpalletid = cpalletid == null ? null : cpalletid.trim();
    }

    public String getXpalletid() {
        return xpalletid;
    }

    public void setXpalletid(String xpalletid) {
        this.xpalletid = xpalletid == null ? null : xpalletid.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public Integer getIssys() {
        return issys;
    }

    public void setIssys(Integer issys) {
        this.issys = issys;
    }

    public String getWorktype() {
        return worktype;
    }

    public void setWorktype(String worktype) {
        this.worktype = worktype == null ? null : worktype.trim();
    }
}