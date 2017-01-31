package com.econet.siteco.model;

import javax.persistence.*;
import javax.validation.constraints.Past;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
    @Column(name = "type_of_structure")
    private String typeOfStructure;
    private String manufacturer;
    private String serialNumber;
    @Past(message = "Date of installation must be in past.")
    private Date dateOfInstallation;//Audit
    private Boolean earthed;
    private String status; // active/offlines
    private String earthingConditions;
    private String siteEarthingConditions;
    private Integer navigationLights;
    private Boolean canTakeAdditionalLoading;
    private Boolean towerFailureRisk;
    @ManyToOne  //Double Tower possibility
    private Site site;
    private List<? extends TowerElement> elements;

    public Tower() {
        elements = new ArrayList<>();
    }

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

    public Boolean getTowerFailureRisk() {
        return towerFailureRisk;
    }

    public void setTowerFailureRisk(Boolean towerFailureRisk) {
        this.towerFailureRisk = towerFailureRisk;
    }

    public String getTypeOfStructure() {
        return typeOfStructure;
    }

    public void setTypeOfStructure(String typeOfStructure) {
        this.typeOfStructure = typeOfStructure;
    }

    public Date getDateOfInstallation() {
        return dateOfInstallation;
    }

    public void setDateOfInstallation(Date dateOfInstallation) {
        this.dateOfInstallation = dateOfInstallation;
    }

    public Boolean getEarthed() {
        return earthed;
    }

    public void setEarthed(Boolean earthed) {
        this.earthed = earthed;
    }

    public String getEarthingConditions() {
        return earthingConditions;
    }

    public void setEarthingConditions(String earthingConditions) {
        this.earthingConditions = earthingConditions;
    }

    public Boolean getCanTakeAdditionalLoading() {
        return canTakeAdditionalLoading;
    }

    public void setCanTakeAdditionalLoading(Boolean canTakeAdditionalLoading) {
        this.canTakeAdditionalLoading = canTakeAdditionalLoading;
    }

    public Site getSite() {
        return site;
    }

    public void setSite(Site site) {
        this.site = site;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<? extends TowerElement> getElements() {
        return elements;
    }

    public void setElements(List<? extends TowerElement> elements) {
        this.elements = elements;
    }
}
