package com.econet.siteco.service;

import com.econet.siteco.model.Site;

import java.util.List;

/**
 * Created by Aaron on 10/19/2016.
 */
public interface SiteService {

    Site getSiteById(int id);
    Site getSiteByName(String name);
    List<Site> getAllSites();
    Site saveSite(Site site);
    Site updateSite(Site site);
}
