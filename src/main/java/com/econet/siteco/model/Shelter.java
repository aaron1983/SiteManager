package com.econet.siteco.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Aaron on 10/10/2016.
 */
@Entity
@Table(name = "shelter")
public class Shelter extends TowerElement implements Serializable {
    private static final long serialVersionUID = 1L;
    @ManyToOne
    @JoinColumn(name = "id")
    @MapsId
    private ShelterType type; //Shelter Type (Indoor / Outdoor / Room)
    private String size; //Shelter Size (L x B x H)
    private Integer shelters;
    private Integer cabinets;
    private String condition;// (Good/ Fair / Poor)

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public ShelterType getType() {
        return type;
    }

    public void setType(ShelterType type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Integer getShelters() {
        return shelters;
    }

    public void setShelters(Integer shelters) {
        this.shelters = shelters;
    }

    public Integer getCabinets() {
        return cabinets;
    }

    public void setCabinets(Integer cabinets) {
        this.cabinets = cabinets;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }
}
