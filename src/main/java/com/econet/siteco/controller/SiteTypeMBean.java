package com.econet.siteco.controller;

import com.econet.siteco.model.SiteType;
import com.econet.siteco.service.SiteTypeService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Aaron on 10/19/2016.
 */
@Named
@Component
@RequestScoped
public class SiteTypeMBean implements Serializable {

    private static final long serialVersionUID = 1L;
    private static final Logger logger = Logger.getLogger(SiteTypeMBean.class);
    @Inject
    private SiteTypeService siteTypeService;
    private SiteType siteType;
    private List<SiteType> siteTypes;

    public SiteTypeMBean() {
    }

    @PostConstruct
    public void initialize() {

        siteTypes = siteTypeService.findAll();
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
}
