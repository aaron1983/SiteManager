package com.econet.siteco.service;

import com.econet.siteco.model.Site;

import java.util.List;

/**
 * Created by Aaron on 10/19/2016.
 */
public interface SiteService {

    Site getById(Integer id);

    Site getByName(String name);

    List<Site> findAll();

    Site save(Site site);

    Site update(Site site);
}
