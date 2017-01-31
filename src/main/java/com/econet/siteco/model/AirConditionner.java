package com.econet.siteco.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aaron on 01/18/2017.
 */
@Entity
@Table(name = "air_conditionners")
public class AirConditionner extends TowerElement implements Serializable {

    private List<Unit> units;
    private String description;

    public AirConditionner() {
        this.units = new ArrayList<>();
    }
}
