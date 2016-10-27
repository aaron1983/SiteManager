package com.econet.siteco.service.impl;

import com.econet.siteco.model.SiteType;
import com.econet.siteco.repository.SiteTypeRepository;
import com.econet.siteco.service.SiteTypeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Aaron on 10/19/2016.
 */
public class SiteTypeImpl implements SiteTypeService,Serializable {
    private static final long serialVersionUID = 1L;
    @Autowired
    private SiteTypeRepository siteTypeRepository;

    @Override
    public SiteType getSiteTypeById(int id) {
        return siteTypeRepository.findOne(id);
    }

    @Override
    public SiteType getSiteTypeByName(String name) {
        return siteTypeRepository.findByName(name);
    }

    @Override
    public List<SiteType> getAllSiteTypes() {
        return siteTypeRepository.findAll();
    }

    @Override
    public SiteType saveSite(SiteType siteType) {
        return siteTypeRepository.save(siteType);
    }

    @Override
    public SiteType updateSiteType(SiteType siteType) {
        return siteTypeRepository.save(siteType);
    }
}
