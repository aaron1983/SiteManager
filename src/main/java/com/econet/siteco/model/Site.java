package com.econet.siteco.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import java.util.Date;

/**
 * Created by Aaron on 10/10/2016.
 */
@Entity
@Table(name = "sites")
public class Site {
    @Id
    @Column(name = "site_id")
    private String id;
    @NotNull(message = "Please provide site name.")
    @Column(name="site_name",unique = true,nullable = false)
    private String name;
    @ManyToOne
    private Commune commune;
    @ManyToOne
    @JoinColumn(name="province_id")
    private Province province;
    private String address;
    private String landOwner;
    private String landLord;
    private Double longitude;
    private Double latitude;
    private Double altitude;
    @Past(message = "Date acquired must be in the past.")
    @Temporal(TemporalType.DATE)
    @Column(name="dateAcquired",unique = true,nullable = false)
    private Date dateAcquired;
    @Lob
    @Column(name="access_rules")
    private String accessRules;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLandOwner() {
        return landOwner;
    }

    public void setLandOwner(String landOwner) {
        this.landOwner = landOwner;
    }

    public String getLandLord() {
        return landLord;
    }

    public void setLandLord(String landLord) {
        this.landLord = landLord;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getAltitude() {
        return altitude;
    }

    public void setAltitude(Double altitude) {
        this.altitude = altitude;
    }

    public Date getDateAcquired() {
        return dateAcquired;
    }

    public void setDateAcquired(Date dateAcquired) {
        this.dateAcquired = dateAcquired;
    }

    public String getAccessRules() {
        return accessRules;
    }

    public void setAccessRules(String accessRules) {
        this.accessRules = accessRules;
    }
}
