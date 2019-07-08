package entity;

import java.io.Serializable;

public class UserRole implements Serializable {
    private Long id;

    private String userCode;

    private String roleCode;

    private User user;

    private Role role;

    private int companyid;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
    public int getCompanyId() {
        return companyid;
    }

    public void setCompanyId(int companyid) {
        this.companyid = companyid;
    }
    @Override
    public String toString(){
        return "UserRole:"+ userCode+"  "+roleCode+"  "+ user.getUserName()+"  "+role.getRoleName();
    }


}