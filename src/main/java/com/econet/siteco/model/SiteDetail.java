package com.econet.siteco.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by Aaron on 10/10/2016.
 */
@Entity
@Table(name="site_details")
public class SiteDetail {

    @ManyToOne
    @JoinColumn(name = "site_type_id")
    @MapsId
    SiteType type;
    @Id
    @GeneratedValue
    private Long id;
    @NotNull(message = "Please select a site.")
    @OneToOne(cascade = CascadeType.ALL, optional = false, fetch = FetchType.EAGER, orphanRemoval = true)
    @JoinColumn(name = "site_id") @MapsId
    private  Site site;
    @NotNull
    @Column(name="site_size")
    private Double siteSize;
    @NotNull
    @Column(name="number_of_tenants")
    private Integer tenants;
    private Boolean spaceToExtendSiteForAdditionalTenants;
    private Boolean spaceForAdditionalTenantsEquipment;
    @Column(name="fence_type")
    private String fenceType;
    @Column(name="physical_security")
    private Boolean physicalSecurity;
    @Column(name="security_company_name")
    private String securityCompanyName;
    private List<? extends LockingSystem> lockingSystems;
    @Column(name="site_accessibility")
    private String accessibility;
    @Column(name="access_road_type")
    private String accessRoadType;
    @Column(name="access_road_condition")
    private String accessRoadCondition;
    @Column(name="overall_site_condition")
    private String overallSiteCondition;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Site getSite() {
        return site;
    }

    public void setSite(Site site) {
        this.site = site;
    }

    public SiteType getType() {
        return type;
    }

    public void setType(SiteType type) {
        this.type = type;
    }

    public Double getSiteSize() {
        return siteSize;
    }

    public void setSiteSize(Double siteSize) {
        this.siteSize = siteSize;
    }

    public Integer getTenants() {
        return tenants;
    }

    public void setTenants(Integer tenants) {
        this.tenants = tenants;
    }

    public Boolean getSpaceToExtendSiteForAdditionalTenants() {
        return spaceToExtendSiteForAdditionalTenants;
    }

    public void setSpaceToExtendSiteForAdditionalTenants(Boolean spaceToExtendSiteForAdditionalTenants) {
        this.spaceToExtendSiteForAdditionalTenants = spaceToExtendSiteForAdditionalTenants;
    }

    public Boolean getSpaceForAdditionalTenantsEquipment() {
        return spaceForAdditionalTenantsEquipment;
    }

    public void setSpaceForAdditionalTenantsEquipment(Boolean spaceForAdditionalTenantsEquipment) {
        this.spaceForAdditionalTenantsEquipment = spaceForAdditionalTenantsEquipment;
    }

    public String getFenceType() {
        return fenceType;
    }

    public void setFenceType(String fenceType) {
        this.fenceType = fenceType;
    }

    public Boolean getPhysicalSecurity() {
        return physicalSecurity;
    }

    public void setPhysicalSecurity(Boolean physicalSecurity) {
        this.physicalSecurity = physicalSecurity;
    }

    public String getSecurityCompanyName() {
        return securityCompanyName;
    }

    public void setSecurityCompanyName(String securityCompanyName) {
        this.securityCompanyName = securityCompanyName;
    }

    public List<? extends LockingSystem> getLockingSystem() {
        return lockingSystems;
    }

    public void setLockingSystem(List<? extends LockingSystem> lockingSystems) {
        this.lockingSystems = lockingSystems;
    }

    public String getAccessibility() {
        return accessibility;
    }

    public void setAccessibility(String accessibility) {
        this.accessibility = accessibility;
    }

    public String getAccessRoadType() {
        return accessRoadType;
    }

    public void setAccessRoadType(String accessRoadType) {
        this.accessRoadType = accessRoadType;
    }

    public String getAccessRoadCondition() {
        return accessRoadCondition;
    }

    public void setAccessRoadCondition(String accessRoadCondition) {
        this.accessRoadCondition = accessRoadCondition;
    }

    public String getOverallSiteCondition() {
        return overallSiteCondition;
    }

    public void setOverallSiteCondition(String overallSiteCondition) {
        this.overallSiteCondition = overallSiteCondition;
    }
}
