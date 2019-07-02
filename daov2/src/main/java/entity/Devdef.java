package com.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class Devdef implements Serializable {
    private Integer id;

    private Integer devid;

    private Integer typeId;

    private Integer vendorId;

    private Integer timeMaintenance;

    private Integer timeWork;

    private BigDecimal horizonsum;

    private BigDecimal virticalsum;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDevid() {
        return devid;
    }

    public void setDevid(Integer devid) {
        this.devid = devid;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getVendorId() {
        return vendorId;
    }

    public void setVendorId(Integer vendorId) {
        this.vendorId = vendorId;
    }

    public Integer getTimeMaintenance() {
        return timeMaintenance;
    }

    public void setTimeMaintenance(Integer timeMaintenance) {
        this.timeMaintenance = timeMaintenance;
    }

    public Integer getTimeWork() {
        return timeWork;
    }

    public void setTimeWork(Integer timeWork) {
        this.timeWork = timeWork;
    }

    public BigDecimal getHorizonsum() {
        return horizonsum;
    }

    public void setHorizonsum(BigDecimal horizonsum) {
        this.horizonsum = horizonsum;
    }

    public BigDecimal getVirticalsum() {
        return virticalsum;
    }

    public void setVirticalsum(BigDecimal virticalsum) {
        this.virticalsum = virticalsum;
    }
}