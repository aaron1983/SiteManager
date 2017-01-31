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
    public Province getById(int id) {
        return provinceRepository.findOne(id);
    }

    @Override
    public Province getByName(String name) {
        return provinceRepository.findByName(name);
    }

    @Override
    public List<Province> findAll() {
        return provinceRepository.findAll();
    }

    @Override
    public Province save(Province province) {
        return provinceRepository.save(province);
    }

    @Override
    public Province update(Province province) {
        return null;
    }
}
