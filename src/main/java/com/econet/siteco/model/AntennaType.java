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
public class AntennaType implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    private  Integer id;
    @NotNull
    @Column(name="type_name")
    private String typeName;
    private String description;
}
