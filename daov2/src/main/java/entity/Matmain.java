package entity;

import java.io.Serializable;
import java.util.Date;

public class Matmain implements Serializable {
    private Integer id;

    private String matmainid;

    private String mmname;

    private String memo;

    private Integer isinused;

    private Integer companyId;

    private Date createTime;

    private String creator;


    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMatmainid() {
        return matmainid;
    }

    public void setMatmainid(String matmainid) {
        this.matmainid = matmainid == null ? null : matmainid.trim();
    }

    public String getMmname() {
        return mmname;
    }

    public void setMmname(String mmname) {
        this.mmname = mmname == null ? null : mmname.trim();
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
        this.creator = creator;
    }

    @Override
    public String toString(){
        return "Matmain:  ="+matmainid+"  "+memo+"  "+mmname+" "+createTime;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }
}