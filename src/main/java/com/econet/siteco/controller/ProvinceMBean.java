package com.econet.siteco.controller;

import com.econet.siteco.model.Province;
import com.econet.siteco.service.ProvinceService;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Aaron on 10/18/2016.
 */
@Named
@RequestScoped
public class ProvinceMBean implements Serializable {

    @Inject
    private ProvinceService provinceService;

    private Province province;
    private List<Province> provinces;

    @PostConstruct
    public void initialize() {
        provinces = provinceService.findAll();
    }

    public ProvinceService getProvinceService() {
        return provinceService;
    }

    public void setProvinceService(ProvinceService provinceService) {
        this.provinceService = provinceService;
    }

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }

    public List<Province> getProvinces() {
        return provinces;
    }

    public void setProvinces(List<Province> provinces) {
        this.provinces = provinces;
    }
}
