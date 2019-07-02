package entity;

import java.io.Serializable;
import java.util.Date;

public class Storedef implements Serializable {
    private Long id;

    private String storedefCode;

    private String storedefName;

    private String storedefType;

    private String memo;

    private Date createTime;

    private String creator;

    private Date updateTime;

    private String updator;

    private Integer isenabled;

    private Integer isdeleted;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStoredefCode() {
        return storedefCode;
    }

    public void setStoredefCode(String storedefCode) {
        this.storedefCode = storedefCode == null ? null : storedefCode.trim();
    }

    public String getStoredefName() {
        return storedefName;
    }

    public void setStoredefName(String storedefName) {
        this.storedefName = storedefName == null ? null : storedefName.trim();
    }

    public String getStoredefType() {
        return storedefType;
    }

    public void setStoredefType(String storedefType) {
        this.storedefType = storedefType == null ? null : storedefType.trim();
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

    public Integer getIsenabled() {
        return isenabled;
    }

    public void setIsenabled(Integer isenabled) {
        this.isenabled = isenabled;
    }

    public Integer getIsdeleted() {
        return isdeleted;
    }

    public void setIsdeleted(Integer isdeleted) {
        this.isdeleted = isdeleted;
    }
}