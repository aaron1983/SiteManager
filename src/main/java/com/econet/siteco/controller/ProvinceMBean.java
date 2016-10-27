package com.econet.siteco.controller;

import com.econet.siteco.model.Province;
import com.econet.siteco.repository.ProvinceRepository;
import com.econet.siteco.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Aaron on 10/18/2016.
 */
@ManagedBean
@ViewScoped
public class ProvinceMBean implements Serializable {

    @ManagedProperty(value = "#{provinceService}")
    private ProvinceService provinceService;

    private Province province;
    private List<Province> provinces;

    @PostConstruct
    public void init(){
     provinces=provinceService.getAllProvinces();
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
