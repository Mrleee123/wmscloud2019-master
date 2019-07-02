package com.model;

import java.io.Serializable;
import java.util.Date;

public class Matdet implements Serializable {
    private Long id;

    private Long matmainId;

    private String matname;

    private String mspeci;

    private String munit;

    private String mweight;

    private String memo;

    private String maxstore;

    private String minstore;

    private Integer storageTime;

    private Date createTime;

    private String creator;

    private Date updateTime;

    private String updator;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMatmainId() {
        return matmainId;
    }

    public void setMatmainId(Long matmainId) {
        this.matmainId = matmainId;
    }

    public String getMatname() {
        return matname;
    }

    public void setMatname(String matname) {
        this.matname = matname == null ? null : matname.trim();
    }

    public String getMspeci() {
        return mspeci;
    }

    public void setMspeci(String mspeci) {
        this.mspeci = mspeci == null ? null : mspeci.trim();
    }

    public String getMunit() {
        return munit;
    }

    public void setMunit(String munit) {
        this.munit = munit == null ? null : munit.trim();
    }

    public String getMweight() {
        return mweight;
    }

    public void setMweight(String mweight) {
        this.mweight = mweight == null ? null : mweight.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public String getMaxstore() {
        return maxstore;
    }

    public void setMaxstore(String maxstore) {
        this.maxstore = maxstore == null ? null : maxstore.trim();
    }

    public String getMinstore() {
        return minstore;
    }

    public void setMinstore(String minstore) {
        this.minstore = minstore == null ? null : minstore.trim();
    }

    public Integer getStorageTime() {
        return storageTime;
    }

    public void setStorageTime(Integer storageTime) {
        this.storageTime = storageTime;
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