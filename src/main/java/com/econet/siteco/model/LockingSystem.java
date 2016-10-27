package com.econet.siteco.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Aaron on 10/10/2016.
 */
@Entity
@Table(name="locking_systems")
public class LockingSystem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @NotNull
    @Column(name="name",unique = true,nullable = false)
    private String lockingSystemName;
    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLockingSystemName() {
        return lockingSystemName;
    }

    public void setLockingSystemName(String lockingSystemName) {
        this.lockingSystemName = lockingSystemName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
