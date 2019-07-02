package entity;

import java.io.Serializable;
import java.util.Date;

public class Role implements Serializable {
    private Integer id;

    private String roleCode;

    private String roleName;

    private String memo;

    private Date createTime;

    private String creator;

    private int isenabled;

    private static final long serialVersionUID = 1L;

    public int getIsenabled() {
        return isenabled;
    }

    public void setIsenabled(int isenabled) {
        this.isenabled = isenabled;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode == null ? null : roleCode.trim();
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
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
        return "Role{" +
                "id='" +id  + '\'' +
                "roleCode='" +roleCode  + '\'' +
                "roleName='" +roleName  + '\'' +
                "memo='" +memo  + '\'' +
                ", creator='" + creator + '\'' +
                ", isenabled='" + isenabled + '\'' +
                '}';
    }
}