package com.econet.siteco.service.impl;

import com.econet.siteco.model.Site;
import com.econet.siteco.repository.SiteRepository;
import com.econet.siteco.service.SiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.enterprise.context.ApplicationScoped;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Aaron on 10/11/2016.
 */
@Service(value = "siteService")
@ApplicationScoped
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
    public Site getById(Integer id) {
        return siteRepository.findOne(id);
    }

    @Override
    public Site getByName(String name) {
        return siteRepository.findByName(name);
    }

    @Override
    public List<Site> findAll() {
        return siteRepository.findAll();
    }

    @Override
    public Site save(Site site) {
        return siteRepository.save(site);
    }

    @Override
    public Site update(Site site) {
        return siteRepository.save(site);
    }
}
