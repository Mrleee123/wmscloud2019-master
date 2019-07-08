package entity;

import java.io.Serializable;
import java.util.Date;

public class RoleFunction implements Serializable {
    private Integer id;
    private String RoleCode;
    private String FunctionName;
    private Date updateTime;
    private Integer companyid;

    //private static final long serialVersionUID = 1L;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleCode() {
        return RoleCode;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public void setRoleCode(String roleCode) {
        RoleCode = roleCode;
    }

    public String getFunctionName() {
        return FunctionName;
    }

    public void setFunctionName(String functionName) {
        FunctionName = functionName;
    }
    public Integer getCompanyId() {
        return companyid;
    }

    public void setCompanyId(Integer companyid) {
        this.companyid = companyid;
    }
    @Override
    public String toString() {
        return "Role{" +
                "id='" + id + '\'' +
                "RoleCode='" + RoleCode + '\'' +
                "FunctionName='" + FunctionName + '\'' +
                '}';
    }


}
