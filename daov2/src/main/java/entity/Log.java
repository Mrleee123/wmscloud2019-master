package entity;

import java.io.Serializable;
import java.util.Date;

public class Log implements Serializable {
    private Long id;

    private Date ltime;

    private String lclass;

    private String funmain;

    private String munc;

    private String userid;

    private String memo;

    private String detail;

    private Integer companyId;

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

    public String getLclass() {
        return lclass;
    }

    public void setLclass(String lclass) {
        this.lclass = lclass == null ? null : lclass.trim();
    }

    public String getFunmain() {
        return funmain;
    }

    public void setFunmain(String funmain) {
        this.funmain = funmain == null ? null : funmain.trim();
    }

    public String getMunc() {
        return munc;
    }

    public void setMunc(String munc) {
        this.munc = munc == null ? null : munc.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }
}