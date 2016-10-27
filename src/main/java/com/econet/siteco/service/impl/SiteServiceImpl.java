package com.econet.siteco.service.impl;

import com.econet.siteco.model.Site;
import com.econet.siteco.repository.SiteRepository;
import com.econet.siteco.service.SiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Aaron on 10/11/2016.
 */
@Service(value = "siteService")
public class SiteServiceImpl implements SiteService,Serializable {


    private static final long serialVersionUID = 1L;

    @Autowired
    private SiteRepository siteRepository;


    public SiteRepository getSiteRepository() {
        return siteRepository;
    }

    public void setSiteRepository(SiteRepository siteRepository) {
        this.siteRepository = siteRepository;
    }

    @Override
    public Site getSiteById(int id) {
        return siteRepository.findOne(id);
    }

    @Override
    public Site getSiteByName(String name) {
        return siteRepository.findByName(name);
    }

    @Override
    public List<Site> getAllSites() {
        return siteRepository.findAll();
    }

    @Override
    public Site saveSite(Site site) {
        return siteRepository.save(site);
    }

    @Override
    public Site updateSite(Site site) {
        return siteRepository.save(site);
    }
}
