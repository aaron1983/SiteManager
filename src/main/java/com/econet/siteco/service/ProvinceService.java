package com.econet.siteco.service;

import com.econet.siteco.model.Province;

import java.util.List;

/**
 * Created by Aaron on 10/18/2016.
 */
public interface ProvinceService {

    Province getById(int id);

    Province getByName(String name);

    List<Province> findAll();

    Province save(Province province);

    Province update(Province province);
}
