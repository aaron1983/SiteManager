package com.econet.siteco.converter;

import com.econet.siteco.model.SiteType;
import com.econet.siteco.service.SiteTypeService;
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
public class SiteTypeConverter implements Converter {

    @ManagedProperty(value = "#{siteTypeService}")
    private SiteTypeService siteTypeService;
    private static final Logger logger = LoggerFactory.getLogger(SiteTypeConverter.class);

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
      return siteTypeService.getSiteTypeById(Integer.parseInt(value));
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if (value == null) {
            return "";
        }
        if (value instanceof SiteType) {
            logger.info("SiteType value:{}",value);
            return ((SiteType) value).getId().toString();
        } else {
            throw new IllegalArgumentException("Unexpected value type");
        }
    }

    public SiteTypeService getSiteTypeService() {
        return siteTypeService;
    }

    public void setSiteTypeService(SiteTypeService siteTypeService) {
        this.siteTypeService = siteTypeService;
    }
}
