package entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class ZuHuService implements Serializable {
    private Integer id;

    private Integer companyId;

    private Integer serviceId;

    private Integer timework;

    private Integer timeleft;

    private BigDecimal moneyleft;



    public ZuHu zuHu;

    public Service service;

    private static final long serialVersionUID = 1L;

    public ZuHu getZuHu() {
        return zuHu;
    }

    public void setZuHu(ZuHu zuHu) {
        this.zuHu = zuHu;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getZuhuId() {
        return companyId;
    }

    public void setZuhuId(Integer zuhuId) {
        this.companyId = zuhuId;
    }

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public Integer getTimework() {
        return timework;
    }

    public void setTimework(Integer timework) {
        this.timework = timework;
    }

    public Integer getTimeleft() {
        return timeleft;
    }

    public void setTimeleft(Integer timeleft) {
        this.timeleft = timeleft;
    }

    public BigDecimal getMoneyleft() {
        return moneyleft;
    }

    public void setMoneyleft(BigDecimal moneyleft) {
        this.moneyleft = moneyleft;
    }
}