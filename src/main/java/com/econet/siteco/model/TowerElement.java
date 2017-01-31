package com.econet.siteco.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * Created by Aaron on 01/18/2017.
 */
@Entity
@Table(name = "tower_element")
public class TowerElement {
    @Id
    private Integer id;
    @NotNull(message = "Please provide element name")
    private String name;

}
