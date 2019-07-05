package entity;

import java.io.Serializable;
import java.util.Date;

public class Project implements Serializable {
    private Integer id;

    private String projectName;

    private String projectCode;

    private String contractName;

    private Integer totalprice;

    private Long invoiced;

    private String paidInRatio;

    private String paidInPrice;

    private String status;

    private String address;

    private String leadorElectric;

    private String leadorSoft;

    private String mm;

    private String pm;

    private String drawingElectric;

    private String drawingDesign;

    private String protocolMonitor;

    private String contractText;

    private Date starttime;

    private Date endtimeCalculate;

    private Date endtimeReal;

    private Integer aislenum;

    private Long racknum;

    private Long devnum;

    private String country;

    private String province;

    private String city;

    private Integer companyId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode == null ? null : projectCode.trim();
    }

    public String getContractName() {
        return contractName;
    }

    public void setContractName(String contractName) {
        this.contractName = contractName == null ? null : contractName.trim();
    }

    public Integer getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(Integer totalprice) {
        this.totalprice = totalprice;
    }

    public Long getInvoiced() {
        return invoiced;
    }

    public void setInvoiced(Long invoiced) {
        this.invoiced = invoiced;
    }

    public String getPaidInRatio() {
        return paidInRatio;
    }

    public void setPaidInRatio(String paidInRatio) {
        this.paidInRatio = paidInRatio == null ? null : paidInRatio.trim();
    }

    public String getPaidInPrice() {
        return paidInPrice;
    }

    public void setPaidInPrice(String paidInPrice) {
        this.paidInPrice = paidInPrice == null ? null : paidInPrice.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getLeadorElectric() {
        return leadorElectric;
    }

    public void setLeadorElectric(String leadorElectric) {
        this.leadorElectric = leadorElectric == null ? null : leadorElectric.trim();
    }

    public String getLeadorSoft() {
        return leadorSoft;
    }

    public void setLeadorSoft(String leadorSoft) {
        this.leadorSoft = leadorSoft == null ? null : leadorSoft.trim();
    }

    public String getMm() {
        return mm;
    }

    public void setMm(String mm) {
        this.mm = mm == null ? null : mm.trim();
    }

    public String getPm() {
        return pm;
    }

    public void setPm(String pm) {
        this.pm = pm == null ? null : pm.trim();
    }

    public String getDrawingElectric() {
        return drawingElectric;
    }

    public void setDrawingElectric(String drawingElectric) {
        this.drawingElectric = drawingElectric == null ? null : drawingElectric.trim();
    }

    public String getDrawingDesign() {
        return drawingDesign;
    }

    public void setDrawingDesign(String drawingDesign) {
        this.drawingDesign = drawingDesign == null ? null : drawingDesign.trim();
    }

    public String getProtocolMonitor() {
        return protocolMonitor;
    }

    public void setProtocolMonitor(String protocolMonitor) {
        this.protocolMonitor = protocolMonitor == null ? null : protocolMonitor.trim();
    }

    public String getContractText() {
        return contractText;
    }

    public void setContractText(String contractText) {
        this.contractText = contractText == null ? null : contractText.trim();
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtimeCalculate() {
        return endtimeCalculate;
    }

    public void setEndtimeCalculate(Date endtimeCalculate) {
        this.endtimeCalculate = endtimeCalculate;
    }

    public Date getEndtimeReal() {
        return endtimeReal;
    }

    public void setEndtimeReal(Date endtimeReal) {
        this.endtimeReal = endtimeReal;
    }

    public Integer getAislenum() {
        return aislenum;
    }

    public void setAislenum(Integer aislenum) {
        this.aislenum = aislenum;
    }

    public Long getRacknum() {
        return racknum;
    }

    public void setRacknum(Long racknum) {
        this.racknum = racknum;
    }

    public Long getDevnum() {
        return devnum;
    }

    public void setDevnum(Long devnum) {
        this.devnum = devnum;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }
}