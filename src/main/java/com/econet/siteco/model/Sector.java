package com.econet.siteco.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by Aaron on 10/12/2016.
 */
@Entity
public class Sector implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    private  Integer id;
    @NotNull
    @Column(name="sector_name")
    private String sectorName;
    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSectorName() {
        return sectorName;
    }

    public void setSectorName(String sectorName) {
        this.sectorName = sectorName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
