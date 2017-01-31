package com.econet.siteco.model;

import javax.persistence.*;
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
    @ManyToOne(fetch = FetchType.EAGER)
    private Antenna antenna;
    @NotNull
    @Column(name="sector_name")
    private String name;
    @Column(name = "height_on_tower")
    private Double heihtOnTower;
    private Double size;
    @Column(name = "azimuths_position")
    private Double azimuthsPosition;
    private Double tilt;
    private String make;
    private String model;
    private Integer downFitsMechanichal;
    private Integer downFitsElectrical;
    private String mountingPole;
    private String feeders;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Antenna getAntenna() {
        return antenna;
    }

    public void setAntenna(Antenna antenna) {
        this.antenna = antenna;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getHeihtOnTower() {
        return heihtOnTower;
    }

    public void setHeihtOnTower(Double heihtOnTower) {
        this.heihtOnTower = heihtOnTower;
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public Double getAzimuthsPosition() {
        return azimuthsPosition;
    }

    public void setAzimuthsPosition(Double azimuthsPosition) {
        this.azimuthsPosition = azimuthsPosition;
    }

    public Double getTilt() {
        return tilt;
    }

    public void setTilt(Double tilt) {
        this.tilt = tilt;
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

    public Integer getDownFitsMechanichal() {
        return downFitsMechanichal;
    }

    public void setDownFitsMechanichal(Integer downFitsMechanichal) {
        this.downFitsMechanichal = downFitsMechanichal;
    }

    public Integer getDownFitsElectrical() {
        return downFitsElectrical;
    }

    public void setDownFitsElectrical(Integer downFitsElectrical) {
        this.downFitsElectrical = downFitsElectrical;
    }

    public String getMountingPole() {
        return mountingPole;
    }

    public void setMountingPole(String mountingPole) {
        this.mountingPole = mountingPole;
    }

    public String getFeeders() {
        return feeders;
    }

    public void setFeeders(String feeders) {
        this.feeders = feeders;
    }
}
