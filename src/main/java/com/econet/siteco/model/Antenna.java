package com.econet.siteco.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Aaron on 10/10/2016.
 */
@Entity
public class Antenna implements Serializable {
    private static final long serialVersionUID = 1L;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    List<Sector> sectors;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private Tower tower;
    @ManyToOne(fetch = FetchType.EAGER)
    private AntennaType type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public AntennaType getType() {
        return type;
    }

    public void setType(AntennaType type) {
        this.type = type;
    }

    public List<Sector> getSectors() {
        return sectors;
    }

    public void setSectors(List<Sector> sectors) {
        this.sectors = sectors;
    }
}
