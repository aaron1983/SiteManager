package com.econet.siteco.controller;

import com.econet.siteco.model.SiteType;
import com.econet.siteco.service.SiteTypeService;
import org.apache.log4j.Logger;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedProperty;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Aaron on 10/19/2016.
 */
@Named(value = "siteTypeManagedBean")
@Component
@Scope("session")
public class SiteTypeMBean implements Serializable {

    private static final long serialVersionUID = 1L;
    @ManagedProperty(value = "#{siteService}")
    private SiteTypeService siteTypeService;

    private SiteType siteType;
    private List<SiteType> siteTypes;
    private static final Logger logger = Logger.getLogger(SiteTypeMBean.class);

    @PostConstruct
    public void init() {

        siteTypes=siteTypeService.getAllSiteTypes();
    }

    public SiteTypeService getSiteTypeService() {
        return siteTypeService;
    }

    public void setSiteTypeService(SiteTypeService siteTypeService) {
        this.siteTypeService = siteTypeService;
    }

    public SiteType getSiteType() {
        return siteType;
    }

    public void setSiteType(SiteType siteType) {
        this.siteType = siteType;
    }

    public List<SiteType> getSiteTypes() {
        return siteTypes;
    }

    public void setSiteTypes(List<SiteType> siteTypes) {
        this.siteTypes = siteTypes;
    }

    public SiteTypeMBean() {
    }
}
