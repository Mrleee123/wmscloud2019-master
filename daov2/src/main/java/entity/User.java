package entity;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class User implements Serializable {
    private Long id;

    private Integer issa;

    private String user_Code;

    private String user_Name;

    private String password;

    private String demo;

    private Date create_Time;

    private String creator;

    private Date update_Time;

    private Integer isenabled;

    private Integer isdeleted;

    private Integer companyId;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getIssa() {
        return issa;
    }

    public void setIssa(Integer issa) {
        this.issa = issa;
    }

    public String getUserCode() {
        return user_Code;
    }

    public void setUserCode(String userCode) {
        this.user_Code = userCode == null ? null : userCode.trim();
    }

    public String getUserName() {
        return user_Name;
    }

    public void setUserName(String userName) {
        this.user_Name = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getDemo() {
        return demo;
    }

    public void setDemo(String demo) {
        this.demo = demo == null ? null : demo.trim();
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

    @Override
    public String toString() {
        return "User{" +
                "issa='" +issa  + '\'' +
                "demo='" +demo  + '\'' +
                "isenabled='" +isenabled  + '\'' +
                "isdeleted='" +isdeleted  + '\'' +
                ", user_Code='" + user_Code + '\'' +
                ", user_Name='" + user_Name + '\'' +
                ", password=" + password + '\'' +
                  ", creator='" + creator + '\'' +
                '}';
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }
}
