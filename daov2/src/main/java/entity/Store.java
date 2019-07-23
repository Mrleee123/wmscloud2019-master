package entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class Store implements Serializable {
    private Integer id;

    private Integer storedefId;

    private Long cId;

    private String palletid;

    private Long mId;

    private String productionDate;

    private BigDecimal num;

    private BigDecimal weight;

    private String mstatus;

    private String batchno;

    private Integer vendorId;

    private Integer customerId;

    private String billno;

    private Integer billHeadId;

    private Integer billDetailId;

    private String memo;

    private Integer companyId;

    private Rack rack;

    private Matdet matdet;

    private Vendor vendor;

    private  BillHead billHead;

    private  BillDetail billDetail;

    private Storedef storedef;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStoredefId() {
        return storedefId;
    }

    public void setStoredefId(Integer storedefId) {
        this.storedefId = storedefId;
    }

    public Long getcId() {
        return cId;
    }

    public void setcId(Long cId) {
        this.cId = cId;
    }

    public String getPalletid() {
        return palletid;
    }

    public void setPalletid(String palletid) {
        this.palletid = palletid == null ? null : palletid.trim();
    }

    public Long getmId() {
        return mId;
    }

    public void setmId(Long mId) {
        this.mId = mId;
    }

    public String getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(String productionDate) {
        this.productionDate = productionDate == null ? null : productionDate.trim();
    }

    public BigDecimal getNum() {
        return num;
    }

    public void setNum(BigDecimal num) {
        this.num = num;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public String getMstatus() {
        return mstatus;
    }

    public void setMstatus(String mstatus) {
        this.mstatus = mstatus == null ? null : mstatus.trim();
    }

    public String getBatchno() {
        return batchno;
    }

    public void setBatchno(String batchno) {
        this.batchno = batchno == null ? null : batchno.trim();
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

    public String getBillno() {
        return billno;
    }

    public void setBillno(String billno) {
        this.billno = billno == null ? null : billno.trim();
    }

    public Integer getBillHeadId() {
        return billHeadId;
    }

    public void setBillHeadId(Integer billHeadId) {
        this.billHeadId = billHeadId;
    }

    public Integer getBillDetailId() {
        return billDetailId;
    }

    public void setBillDetailId(Integer billDetailId) {
        this.billDetailId = billDetailId;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Rack getRack() {
        return rack;
    }

    public void setRack(Rack rack) {
        this.rack = rack;
    }

    public Matdet getMatdet() {
        return matdet;
    }

    public void setMatdet(Matdet matdet) {
        this.matdet = matdet;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    public BillHead getBillHead() {
        return billHead;
    }

    public void setBillHead(BillHead billHead) {
        this.billHead = billHead;
    }

    public BillDetail getBillDetail() {
        return billDetail;
    }

    public void setBillDetail(BillDetail billDetail) {
        this.billDetail = billDetail;
    }

    public Storedef getStoredef() {
        return storedef;
    }

    public void setStoredef(Storedef storedef) {
        this.storedef = storedef;
    }

    public String toString(){
        return "Store:"+ palletid+"  "+ storedef.getStoredefName() + "   "+rack.getCid()+"  "+ matdet.getMatname()+"  "+ num + billDetail.getBillno();
    }
}