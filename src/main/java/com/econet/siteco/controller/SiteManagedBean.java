package com.econet.siteco.controller;


import com.econet.siteco.model.Site;
import com.econet.siteco.service.SiteService;
import org.apache.log4j.Logger;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedProperty;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Aaron on 10/11/2016.
 */
@Named(value = "siteManagedBean")
@Component
@Scope("session")
public class SiteManagedBean implements Serializable {

    private static final long serialVersionUID = 1L;
    @ManagedProperty(value = "#{siteService}")
    private SiteService siteService;

    private Site site;
    private List<Site> sites;
    private static final Logger logger = Logger.getLogger(SiteManagedBean.class);

    @PostConstruct
    public void init() {
        sites=siteService.getAllSites();
    }

    public SiteManagedBean() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public SiteService getSiteService() {
        return siteService;
    }

    public void setSiteService(SiteService siteService) {
        this.siteService = siteService;
    }

    public Site getSite() {
        return site;
    }

    public void setSite(Site site) {
        this.site = site;
    }

    public List<Site> getSites() {
        return sites;
    }

    public void setSites(List<Site> sites) {
        this.sites = sites;
    }

    public static Logger getLogger() {
        return logger;
    }
}
