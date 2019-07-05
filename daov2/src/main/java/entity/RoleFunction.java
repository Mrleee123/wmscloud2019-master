package entity;

import java.io.Serializable;
import java.util.Date;

public class RoleFunction implements Serializable {
    private Integer id;
    private String RoleCode;
    private String FunctionName;
    private Date updateTime;
    private Integer companyId;

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

    @Override
    public String toString() {
        return "Role{" +
                "id='" + id + '\'' +
                "RoleCode='" + RoleCode + '\'' +
                "FunctionName='" + FunctionName + '\'' +
                '}';
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }
}
