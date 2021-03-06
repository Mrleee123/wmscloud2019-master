package entity;

import java.io.Serializable;
import java.util.Date;

public class ZuHu implements Serializable {
    private Integer id;

    private String company;

    private String tel;

    private String postcode;



    private Integer preCompany;

    private Integer ismain;

    private String address;

    private String caegory;

    private Long maxnumUser;

    private Integer maxnumCompany;

    private Long maxnumDev;

    private String serviceAddress;

    private Date createTime;

    private ZuHu zuHu1 ;

    private long projectid;

    private static final long serialVersionUID = 1L;

    public ZuHu getZuHu1() {
        return zuHu1;
    }

    public void setZuHu1(ZuHu zuHu1) {
        this.zuHu1 = zuHu1;
    }

    public Integer getPreCompany() {
        return preCompany;
    }

    public void setPreCompany(Integer preCompany) {
        this.preCompany = preCompany;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode == null ? null : postcode.trim();
    }


    public Integer getIsmain() {
        return ismain;
    }

    public void setIsmain(Integer ismain) {
        this.ismain = ismain;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getCaegory() {
        return caegory;
    }

    public void setCaegory(String caegory) {
        this.caegory = caegory == null ? null : caegory.trim();
    }

    public Long getMaxnumUser() {
        return maxnumUser;
    }

    public void setMaxnumUser(Long maxnumUser) {
        this.maxnumUser = maxnumUser;
    }

    public Integer getMaxnumCompany() {
        return maxnumCompany;
    }

    public void setMaxnumCompany(Integer maxnumCompany) {
        this.maxnumCompany = maxnumCompany;
    }

    public Long getMaxnumDev() {
        return maxnumDev;
    }

    public void setMaxnumDev(Long maxnumDev) {
        this.maxnumDev = maxnumDev;
    }

    public String getServiceAddress() {
        return serviceAddress;
    }

    public void setServiceAddress(String serviceAddress) {
        this.serviceAddress = serviceAddress == null ? null : serviceAddress.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public long getProjectid() {
        return projectid;
    }

    public void setProjectid(long projectid) {
        this.projectid = projectid;
    }
}