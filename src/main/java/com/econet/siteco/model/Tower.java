package com.econet.siteco.model;

import javax.persistence.*;

/**
 * Created by Aaron on 10/10/2016.
 */
@Entity
public class Tower {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name="tower_design_type")
    private String designType;
    private String section;
    private String structureModel;
    @ManyToOne
    private Category category;
    private String vendor;
    private String subcontractor;
    private Double height;
    private Integer legsIfLatice;
    private String manufacturer;
    private String serialNumber;
    private Boolean TowerEarthed;
    private String towerEarthingConditions;
    private String siteEarthingConditions;
    private Integer navigationLights;
    private String additionalLoadingAllowed;
    private String towerFailureRisk;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDesignType() {
        return designType;
    }

    public void setDesignType(String designType) {
        this.designType = designType;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getStructureModel() {
        return structureModel;
    }

    public void setStructureModel(String structureModel) {
        this.structureModel = structureModel;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getSubcontractor() {
        return subcontractor;
    }

    public void setSubcontractor(String subcontractor) {
        this.subcontractor = subcontractor;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Integer getLegsIfLatice() {
        return legsIfLatice;
    }

    public void setLegsIfLatice(Integer legsIfLatice) {
        this.legsIfLatice = legsIfLatice;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Boolean getTowerEarthed() {
        return TowerEarthed;
    }

    public void setTowerEarthed(Boolean towerEarthed) {
        TowerEarthed = towerEarthed;
    }

    public String getTowerEarthingConditions() {
        return towerEarthingConditions;
    }

    public void setTowerEarthingConditions(String towerEarthingConditions) {
        this.towerEarthingConditions = towerEarthingConditions;
    }

    public String getSiteEarthingConditions() {
        return siteEarthingConditions;
    }

    public void setSiteEarthingConditions(String siteEarthingConditions) {
        this.siteEarthingConditions = siteEarthingConditions;
    }

    public Integer getNavigationLights() {
        return navigationLights;
    }

    public void setNavigationLights(Integer navigationLights) {
        this.navigationLights = navigationLights;
    }

    public String getAdditionalLoadingAllowed() {
        return additionalLoadingAllowed;
    }

    public void setAdditionalLoadingAllowed(String additionalLoadingAllowed) {
        this.additionalLoadingAllowed = additionalLoadingAllowed;
    }

    public String getTowerFailureRisk() {
        return towerFailureRisk;
    }

    public void setTowerFailureRisk(String towerFailureRisk) {
        this.towerFailureRisk = towerFailureRisk;
    }
}
