package com.econet.siteco.converter;

import com.econet.siteco.model.Site;
import com.econet.siteco.service.SiteService;
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
public class SiteConverter implements Converter {

    @ManagedProperty(value = "#{siteService}")
    private SiteService siteService;
    private static final Logger logger = LoggerFactory.getLogger(SiteConverter.class);

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        logger.info("Value:{}",value);
        return siteService.getSiteById(Integer.parseInt(value));
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        logger.info("Value:{}",value);
        if (value == null) {
            return "";
        }
        if (value instanceof Site) {
            logger.info("Site value:{}",value);
            return ((Site) value).getId().toString();
        } else {
            throw new IllegalArgumentException("Unexpected value type");
        }
    }

    public SiteService getSiteService() {
        return siteService;
    }

    public void setSiteService(SiteService siteService) {
        this.siteService = siteService;
    }
}
