package com.model;

import java.io.Serializable;
import java.util.Date;

public class IOClass implements Serializable {
    private Integer id;

    private String ioclassCode;

    private String ioclassName;

    private String tranType;

    private String memo;

    private Date createTime;

    private String creator;

    private Date updateTime;

    private String updator;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIoclassCode() {
        return ioclassCode;
    }

    public void setIoclassCode(String ioclassCode) {
        this.ioclassCode = ioclassCode == null ? null : ioclassCode.trim();
    }

    public String getIoclassName() {
        return ioclassName;
    }

    public void setIoclassName(String ioclassName) {
        this.ioclassName = ioclassName == null ? null : ioclassName.trim();
    }

    public String getTranType() {
        return tranType;
    }

    public void setTranType(String tranType) {
        this.tranType = tranType == null ? null : tranType.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdator() {
        return updator;
    }

    public void setUpdator(String updator) {
        this.updator = updator == null ? null : updator.trim();
    }
}