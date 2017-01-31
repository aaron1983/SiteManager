package com.econet.siteco.service;

import com.econet.siteco.model.SiteType;

import java.util.List;

/**
 * Created by Aaron on 10/19/2016.
 */
public interface SiteTypeService {

    SiteType getById(int id);

    SiteType getByName(String name);

    List<SiteType> findAll();

    SiteType save(SiteType siteType);

    SiteType update(SiteType siteType);
}
