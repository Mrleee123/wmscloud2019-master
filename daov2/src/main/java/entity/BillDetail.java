package entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class BillDetail implements Serializable {
    private long id;
    private long bill_head_id;
    private String billno;
    private long m_id;
    private String Mstatus;
    private BigDecimal weight;
    private BigDecimal num;
    private String batchno;
    private String palletid;
    private BigDecimal finishnum;
    private BigDecimal finishweight;
    private int detail_status;
    private String memo;
    private String creator;
    private Date createtime;
    private String updator;
    private Date updatetime;
    private Matdet matdet;
    private BillHead billHead;
    private Integer companyid;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getBill_head_id() {
        return bill_head_id;
    }

    public void setBill_head_id(long bill_head_id) {
        this.bill_head_id = bill_head_id;
    }

    public String getBillno() {
        return billno;
    }

    public void setBillno(String billno) {
        this.billno = billno;
    }

    public long getM_id() {
        return m_id;
    }

    public void setM_id(long m_id) {
        this.m_id = m_id;
    }

    public String getMstatus() {
        return Mstatus;
    }

    public void setMstatus(String Mstatus) {
        this.Mstatus = Mstatus;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public BigDecimal getNum() {
        return num;
    }

    public void setNum(BigDecimal num) {
        this.num = num;
    }

    public String getBatchno() {
        return batchno;
    }

    public void setBatchno(String batchno) {
        this.batchno = batchno;
    }

    public String getPalletid() {
        return palletid;
    }

    public void setPalletid(String palletid) {
        this.palletid = palletid;
    }

    public BigDecimal getFinishnum() {
        return finishnum;
    }

    public void setFinishnum(BigDecimal finishnum) {
        this.finishnum = finishnum;
    }

    public BigDecimal getFinishweight() {
        return finishweight;
    }

    public void setFinishweight(BigDecimal finishweight) {
        this.finishweight = finishweight;
    }

    public int getDetail_status() {
        return detail_status;
    }

    public void setDetail_status(int detail_status) {
        this.detail_status = detail_status;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getUpdator() {
        return updator;
    }

    public void setUpdator(String updator) {
        this.updator = updator;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Matdet getMatdet() {
        return matdet;
    }

    public void setMatdet(Matdet matdet) {
        this.matdet = matdet;
    }

    public BillHead getBillHead() {
        return billHead;
    }

    public void setBillHead(BillHead billHead) {
        this.billHead = billHead;
    }

    public Integer getCompanyid() {
        return companyid;
    }

    public void setCompanyid(Integer companyid) {
        this.companyid = companyid;
    }
}
