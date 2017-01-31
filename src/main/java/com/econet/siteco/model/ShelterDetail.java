package com.econet.siteco.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Aaron on 11/23/2016.
 */
@Entity
@Table(name = "shelter_details")
public class ShelterDetail {

    @Id
    private Integer id;
    private String name;
    private String supplier;
    private String make;
    private String model;
    private String capacity;
    private String oPStstus;
    private String technology;

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

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getoPStstus() {
        return oPStstus;
    }

    public void setoPStstus(String oPStstus) {
        this.oPStstus = oPStstus;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }
}
