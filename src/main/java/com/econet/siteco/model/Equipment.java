package com.econet.siteco.model;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

/**
 * Created by Aaron on 10/10/2016.
 */

public class Equipment {
    @Id
    private Integer id;
    @NotNull
    @ManyToOne
    @JoinColumn(name="eq_type_id")
    private EqType type;
    private String make;
    private String modelNo;
    private String configuration;
    private Integer numberOfCabinets;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public EqType getType() {
        return type;
    }

    public void setType(EqType type) {
        this.type = type;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModelNo() {
        return modelNo;
    }

    public void setModelNo(String modelNo) {
        this.modelNo = modelNo;
    }

    public String getConfiguration() {
        return configuration;
    }

    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }

    public Integer getNumberOfCabinets() {
        return numberOfCabinets;
    }

    public void setNumberOfCabinets(Integer numberOfCabinets) {
        this.numberOfCabinets = numberOfCabinets;
    }
}
