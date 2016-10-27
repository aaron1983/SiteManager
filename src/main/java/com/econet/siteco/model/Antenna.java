package com.econet.siteco.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Aaron on 10/10/2016.
 */
@Entity
public class Antenna implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String   classification ;
    @ManyToOne(fetch = FetchType.EAGER)
    private AntennaType type;
    @ManyToOne(fetch = FetchType.EAGER)
    private Sector sector;
    @Column(name="height")
    private Double heihtOnTower;
    private Double size;
    @Column(name="azimuths_position")
    private Double azimuthsPosition;
    private Double tilt;
    private String make;
    private String model;
    private Integer downFitsMechanichal;
    private Integer downFitsElectrical;
    private String mountingPole;
    private String feeders;
}
