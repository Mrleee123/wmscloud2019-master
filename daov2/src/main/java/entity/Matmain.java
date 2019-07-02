package com.model;

import java.io.Serializable;
import java.util.Date;

public class Matmain implements Serializable {
    private Integer id;

    private String matmainid;

    private String mmname;

    private String memo;

    private Integer isinused;

    private Integer issys;

    private Date createTime;

    private String userid;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMatmainid() {
        return matmainid;
    }

    public void setMatmainid(String matmainid) {
        this.matmainid = matmainid == null ? null : matmainid.trim();
    }

    public String getMmname() {
        return mmname;
    }

    public void setMmname(String mmname) {
        this.mmname = mmname == null ? null : mmname.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public Integer getIsinused() {
        return isinused;
    }

    public void setIsinused(Integer isinused) {
        this.isinused = isinused;
    }

    public Integer getIssys() {
        return issys;
    }

    public void setIssys(Integer issys) {
        this.issys = issys;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }
}