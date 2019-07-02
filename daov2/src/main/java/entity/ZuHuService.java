package com.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class ZuHuService implements Serializable {
    private Integer id;

    private Integer zuhuId;

    private Integer serviceId;

    private Integer timework;

    private Integer timeleft;

    private BigDecimal moneyleft;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getZuhuId() {
        return zuhuId;
    }

    public void setZuhuId(Integer zuhuId) {
        this.zuhuId = zuhuId;
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