package com.econet.siteco.repository;

import com.econet.siteco.model.Site;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Aaron on 10/12/2016.
 */
public interface SiteRepository extends JpaRepository<Site,Integer> {

    public Site findByName(String name);
}
