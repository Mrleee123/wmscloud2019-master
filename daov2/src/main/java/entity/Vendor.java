package entity;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Vendor implements Serializable {
    private Long id;

    private String vendor_Name;

    private String memo;

    private Integer isinused;

    private Date createTime;

    private String creator;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVendorName() {
        return vendor_Name;
    }

    public void setVendorName(String vendorName) {
        this.vendor_Name = vendorName == null ? null : vendorName.trim();
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

    @Override
    public String toString() {
        return "Vendor{" +
                "id='" +id  + '\'' +
                ", vendorName='" + vendor_Name + '\'' +
                ", memo='" + memo + '\'' +
                ", isinused=" + isinused +
                ", createTime='" + new SimpleDateFormat("yyyy-MM-dd").format(createTime) + '\'' +
                ", creator='" + creator + '\'' +

                '}';
    }
}