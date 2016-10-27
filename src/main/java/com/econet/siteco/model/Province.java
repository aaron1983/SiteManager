package com.econet.siteco.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Aaron on 10/10/2016.
 */
@Entity
public class Province {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotNull
    @Column(name="name",unique = true,nullable = false)
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
