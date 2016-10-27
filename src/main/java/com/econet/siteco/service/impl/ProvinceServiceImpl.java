package com.econet.siteco.service.impl;

import com.econet.siteco.model.Province;
import com.econet.siteco.repository.ProvinceRepository;
import com.econet.siteco.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Aaron on 10/18/2016.
 */
@Service(value = "provinceService")
public class ProvinceServiceImpl implements ProvinceService , Serializable {


    private static final long serialVersionUID = 1L;

    @Autowired
    private ProvinceRepository provinceRepository;

    @Override
    public Province getProvinceById(int id) {
        return provinceRepository.findOne(id);
    }

    @Override
    public Province getProvinceByName(String name) {
        return provinceRepository.findByName(name);
    }

    @Override
    public List<Province> getAllProvinces() {
        return provinceRepository.findAll();
    }

    @Override
    public Province saveProvince(Province province) {
        return provinceRepository.save(province);
    }

    @Override
    public Province updateProvince(Province province) {
        return null;
    }
}
