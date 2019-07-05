package entity;

import java.io.Serializable;
import java.util.Date;

public class Matdet implements Serializable {
    private Long id;

    private String mid;

    private Long matmain_Id;

    private String matname;

    private String mspeci;

    private String munit;

    private String mweight;

    private String memo1;

    private String maxstore;

    private String minstore;

    private Integer storageTime;

    private Date create_Time;

    private String creator;

    private Date update_Time;

    private String updator;

    private Matmain matmain;

    private Integer companyId;

    public Matmain getMatmain() {
        return matmain;
    }

    public void setMatmain(Matmain matmain) {
        this.matmain = matmain;
    }

    private static final long serialVersionUID = 1L;

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMatmainId() {
        return matmain_Id;
    }

    public void setMatmainId(Long matmainId) {
        this.matmain_Id = matmainId;
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
        return memo1;
    }

    public void setMemo(String memo) {
        this.memo1 = memo == null ? null : memo.trim();
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
        return create_Time;
    }

    public void setCreateTime(Date createTime) {
        this.create_Time = createTime;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public Date getUpdateTime() {
        return update_Time;
    }

    public void setUpdateTime(Date updateTime) {
        this.update_Time = updateTime;
    }

    public String getUpdator() {
        return updator;
    }

    public void setUpdator(String updator) {
        this.updator = updator == null ? null : updator.trim();
    }

    @Override
    public String toString(){
        return "Matmain:"+id+matname+"  "+mid+" "+memo1+" "+creator+"  "+mspeci+" "+matmain.getMmname();
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }
}