package com.econet.siteco.controller;


import com.econet.siteco.model.Site;
import com.econet.siteco.service.SiteService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Aaron on 10/11/2016.
 */
@Named
@Component
@RequestScoped
public class SiteManagedBean implements Serializable {

    private static final long serialVersionUID = 1L;
    private static final Logger logger = Logger.getLogger(SiteManagedBean.class);
    //@ManagedProperty(value = "#{siteService}") -- older annotation prior to JSF 2.2
    @Inject
    private SiteService siteService;
    private Site site;
    private List<Site> sites;

    public SiteManagedBean() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public static Logger getLogger() {
        return logger;
    }

    @PostConstruct
    public void initialize() {
        logger.info(" Initializing view data...");
        sites = siteService.findAll();
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
}
