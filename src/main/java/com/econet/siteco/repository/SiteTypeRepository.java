package com.econet.siteco.repository;

import com.econet.siteco.model.SiteType;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Aaron on 10/19/2016.
 */
public interface SiteTypeRepository extends JpaRepository<SiteType,Integer> {
    public SiteType findByName(String name);
}
