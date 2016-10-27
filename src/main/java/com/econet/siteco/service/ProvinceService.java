package com.econet.siteco.service;

import com.econet.siteco.model.Province;

import java.util.List;

/**
 * Created by Aaron on 10/18/2016.
 */
public interface ProvinceService {

    Province getProvinceById(int id);
    Province getProvinceByName(String name);
    List<Province> getAllProvinces();
    Province saveProvince(Province province);
    Province updateProvince(Province province);
}
