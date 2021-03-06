package com.econet.siteco.converter;

import com.econet.siteco.model.Province;
import com.econet.siteco.service.ProvinceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

/**
 * Created by Aaron on 10/19/2016.
 */
@ManagedBean
@RequestScoped
public class ProvinceConverter implements Converter {

    private static final Logger logger = LoggerFactory.getLogger(ProvinceConverter.class);
    @ManagedProperty(value = "#{provinceService}")
    private ProvinceService provinceService;

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        logger.info("Value:{}",value);
        return provinceService.getById(Integer.parseInt(value));
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        logger.info("Value:{}",value);
        if (value == null) {
            return "";
        }
        if (value instanceof Province) {
            logger.info("Province value:{}",value);
            return ((Province) value).getId().toString();
        } else {
            throw new IllegalArgumentException("Unexpected value type");
        }
    }

    public ProvinceService getProvinceService() {
        return provinceService;
    }

    public void setProvinceService(ProvinceService provinceService) {
        this.provinceService = provinceService;
    }
}
