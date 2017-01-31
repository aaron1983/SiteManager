package com.econet.siteco.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Aaron on 01/30/2017.
 */
@Entity
public class Tenant implements Serializable {
    @Id
    private String tenanantId;
    private String name;
    private String description;

    public String getTenanantId() {
        return tenanantId;
    }

    public void setTenanantId(String tenanantId) {
        this.tenanantId = tenanantId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
