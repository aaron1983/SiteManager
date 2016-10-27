package com.econet.siteco.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Aaron on 10/10/2016.
 */
@Entity
@Table(name="equipement_type")
public class EqType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @NotNull
    private String typeName;
    private String description;
}
