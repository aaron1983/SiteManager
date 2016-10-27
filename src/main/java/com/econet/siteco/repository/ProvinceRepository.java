package com.econet.siteco.repository;

import com.econet.siteco.model.Province;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Aaron on 10/18/2016.
 */
public interface ProvinceRepository extends JpaRepository<Province, Integer> {
    public Province findByName(String name);
}
