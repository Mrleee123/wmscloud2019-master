package com.model;

import java.io.Serializable;

public class ErrorLog implements Serializable {
    private Integer id;

    private String lclass;

    private String worktype;

    private String cid;

    private String palletid;

    private String detaill;

    private String memo;

    private String userid;

    private Integer storedefId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLclass() {
        return lclass;
    }

    public void setLclass(String lclass) {
        this.lclass = lclass == null ? null : lclass.trim();
    }

    public String getWorktype() {
        return worktype;
    }

    public void setWorktype(String worktype) {
        this.worktype = worktype == null ? null : worktype.trim();
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid == null ? null : cid.trim();
    }

    public String getPalletid() {
        return palletid;
    }

    public void setPalletid(String palletid) {
        this.palletid = palletid == null ? null : palletid.trim();
    }

    public String getDetaill() {
        return detaill;
    }

    public void setDetaill(String detaill) {
        this.detaill = detaill == null ? null : detaill.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public Integer getStoredefId() {
        return storedefId;
    }

    public void setStoredefId(Integer storedefId) {
        this.storedefId = storedefId;
    }
}