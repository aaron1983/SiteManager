package com.econet.siteco.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Aaron on 01/30/2017.
 */
@Entity
public class AccessElement implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(name = "equipment_name", nullable = false, unique = true)
    private String name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
