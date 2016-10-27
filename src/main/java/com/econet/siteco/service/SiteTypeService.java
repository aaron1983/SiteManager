package com.econet.siteco.service;

import com.econet.siteco.model.SiteType;

import java.util.List;

/**
 * Created by Aaron on 10/19/2016.
 */
public interface SiteTypeService {

    SiteType getSiteTypeById(int id);
    SiteType getSiteTypeByName(String name);
    List<SiteType> getAllSiteTypes();
    SiteType saveSite(SiteType siteType);
    SiteType updateSiteType(SiteType siteType);
}
