package entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Tmp implements Serializable {
    private Integer id;

    private Long cId;

    private Long ioclassId;

    private String palletid;

    private Integer mId;

    private Integer num;

    private BigDecimal sweight;

    private String mstatus;

    private Integer vendorId;

    private Long customerId;

    private String batchno;

    private Long iBillId;

    private String memo;

    private Date createTime;

    private String creator;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getcId() {
        return cId;
    }

    public void setcId(Long cId) {
        this.cId = cId;
    }

    public Long getIoclassId() {
        return ioclassId;
    }

    public void setIoclassId(Long ioclassId) {
        this.ioclassId = ioclassId;
    }

    public String getPalletid() {
        return palletid;
    }

    public void setPalletid(String palletid) {
        this.palletid = palletid == null ? null : palletid.trim();
    }

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public BigDecimal getSweight() {
        return sweight;
    }

    public void setSweight(BigDecimal sweight) {
        this.sweight = sweight;
    }

    public String getMstatus() {
        return mstatus;
    }

    public void setMstatus(String mstatus) {
        this.mstatus = mstatus == null ? null : mstatus.trim();
    }

    public Integer getVendorId() {
        return vendorId;
    }

    public void setVendorId(Integer vendorId) {
        this.vendorId = vendorId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getBatchno() {
        return batchno;
    }

    public void setBatchno(String batchno) {
        this.batchno = batchno == null ? null : batchno.trim();
    }

    public Long getiBillId() {
        return iBillId;
    }

    public void setiBillId(Long iBillId) {
        this.iBillId = iBillId;
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
}