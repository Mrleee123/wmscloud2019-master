package entity;

import java.io.Serializable;
import java.util.Date;

public class WorkFlow implements Serializable {
    private Long id;

    private Date ltime;

    private Integer storedefId;

    private String billno;

    private String stackerid;

    private String workType;

    private String palletid;

    private Integer aisle;

    private Integer slayer;

    private Integer srank;

    private Integer srow;

    private Integer taisle;

    private Integer tlayer;

    private Integer trank;

    private Integer trow;

    private String status;

    private String stationid;

    private Long workindx;

    private String xpalletid;

    private Date dealTime;

    private String orderid;

    private Date sendTime;

    private Date createTime;

    private String creator;

    private Integer workId;

    private int companyId;

    private long m_id;

    private int num;

    public long getM_id() {
        return m_id;
    }

    public void setM_id(long m_id) {
        this.m_id = m_id;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getBatchno() {
        return batchno;
    }

    public void setBatchno(String batchno) {
        this.batchno = batchno;
    }

    public Matdet getMatdet() {
        return matdet;
    }

    public void setMatdet(Matdet matdet) {
        this.matdet = matdet;
    }

    private String batchno;

    private Matdet matdet;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getLtime() {
        return ltime;
    }

    public void setLtime(Date ltime) {
        this.ltime = ltime;
    }

    public Integer getStoredefId() {
        return storedefId;
    }

    public void setStoredefId(Integer storedefId) {
        this.storedefId = storedefId;
    }

    public String getBillno() {
        return billno;
    }

    public void setBillno(String billno) {
        this.billno = billno == null ? null : billno.trim();
    }

    public String getStackerid() {
        return stackerid;
    }

    public void setStackerid(String stackerid) {
        this.stackerid = stackerid == null ? null : stackerid.trim();
    }

    public String getWorkType() {
        return workType;
    }

    public void setWorkType(String workType) {
        this.workType = workType == null ? null : workType.trim();
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

    public Integer getSlayer() {
        return slayer;
    }

    public void setSlayer(Integer slayer) {
        this.slayer = slayer;
    }

    public Integer getSrank() {
        return srank;
    }

    public void setSrank(Integer srank) {
        this.srank = srank;
    }

    public Integer getSrow() {
        return srow;
    }

    public void setSrow(Integer srow) {
        this.srow = srow;
    }

    public Integer getTaisle() {
        return taisle;
    }

    public void setTaisle(Integer taisle) {
        this.taisle = taisle;
    }

    public Integer getTlayer() {
        return tlayer;
    }

    public void setTlayer(Integer tlayer) {
        this.tlayer = tlayer;
    }

    public Integer getTrank() {
        return trank;
    }

    public void setTrank(Integer trank) {
        this.trank = trank;
    }

    public Integer getTrow() {
        return trow;
    }

    public void setTrow(Integer trow) {
        this.trow = trow;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getStationid() {
        return stationid;
    }

    public void setStationid(String stationid) {
        this.stationid = stationid == null ? null : stationid.trim();
    }

    public Long getWorkindx() {
        return workindx;
    }

    public void setWorkindx(Long workindx) {
        this.workindx = workindx;
    }

    public String getXpalletid() {
        return xpalletid;
    }

    public void setXpalletid(String xpalletid) {
        this.xpalletid = xpalletid == null ? null : xpalletid.trim();
    }

    public Date getDealTime() {
        return dealTime;
    }

    public void setDealTime(Date dealTime) {
        this.dealTime = dealTime;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
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

    public Integer getWorkId() {
        return workId;
    }

    public void setWorkId(Integer workId) {
        this.workId = workId;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }
}