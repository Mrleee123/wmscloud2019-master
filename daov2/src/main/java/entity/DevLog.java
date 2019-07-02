package com.model;

import java.io.Serializable;
import java.util.Date;

public class DevLog implements Serializable {
    private Integer id;

    private Date ltime;

    private String devno;

    private String acode;

    private String acontent;

    private String cid;

    private String palletid;

    private String memo;

    private String detail;

    private String palletcode;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getLtime() {
        return ltime;
    }

    public void setLtime(Date ltime) {
        this.ltime = ltime;
    }

    public String getDevno() {
        return devno;
    }

    public void setDevno(String devno) {
        this.devno = devno == null ? null : devno.trim();
    }

    public String getAcode() {
        return acode;
    }

    public void setAcode(String acode) {
        this.acode = acode == null ? null : acode.trim();
    }

    public String getAcontent() {
        return acontent;
    }

    public void setAcontent(String acontent) {
        this.acontent = acontent == null ? null : acontent.trim();
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

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    public String getPalletcode() {
        return palletcode;
    }

    public void setPalletcode(String palletcode) {
        this.palletcode = palletcode == null ? null : palletcode.trim();
    }
}