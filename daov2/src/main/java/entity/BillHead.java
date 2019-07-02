package com.model;

import java.io.Serializable;
import java.util.Date;

public class BillHead implements Serializable {
    private Long id;

    private String billno;

    private Integer storedefId;

    private Integer ioclassId;

    private Integer vendorId;

    private Integer customerId;

    private Integer deptId;

    private String memo;

    private Integer headStatus;

    private Date billDate;

    private Date createTime;

    private String creator;

    private Date updateTime;

    private String updator;

    private String gateno;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBillno() {
        return billno;
    }

    public void setBillno(String billno) {
        this.billno = billno == null ? null : billno.trim();
    }

    public Integer getStoredefId() {
        return storedefId;
    }

    public void setStoredefId(Integer storedefId) {
        this.storedefId = storedefId;
    }

    public Integer getIoclassId() {
        return ioclassId;
    }

    public void setIoclassId(Integer ioclassId) {
        this.ioclassId = ioclassId;
    }

    public Integer getVendorId() {
        return vendorId;
    }

    public void setVendorId(Integer vendorId) {
        this.vendorId = vendorId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public Integer getHeadStatus() {
        return headStatus;
    }

    public void setHeadStatus(Integer headStatus) {
        this.headStatus = headStatus;
    }

    public Date getBillDate() {
        return billDate;
    }

    public void setBillDate(Date billDate) {
        this.billDate = billDate;
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

    public String getGateno() {
        return gateno;
    }

    public void setGateno(String gateno) {
        this.gateno = gateno == null ? null : gateno.trim();
    }
}