package com.econet.siteco.model;

/**
 * Created by Aaron on 01/18/2017.
 */
public class Telemetry extends TowerElement {

    private String supplier;
    private String technology;

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }
}
