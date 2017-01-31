package com.econet.siteco.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aaron on 10/10/2016.
 */
@Entity
@Table(name = "access_equipement")
public class AccessEquipment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String tenantName;
    @ManyToOne
    private Tower tower;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<AccessElement> accessElements;

    public AccessEquipment() {
        accessElements = new ArrayList<>();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTenantName() {
        return tenantName;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    public Tower getTower() {
        return tower;
    }

    public void setTower(Tower tower) {
        this.tower = tower;
    }

    public List<AccessElement> getAccessElements() {
        return accessElements;
    }

    public void setAccessElements(List<AccessElement> accessElements) {
        this.accessElements = accessElements;
    }
}
