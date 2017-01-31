package com.econet.siteco.controller;

import org.primefaces.extensions.model.dynaform.DynaFormModel;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

/**
 * Created by Aaron on 01/26/2017.
 */
@Named
@ViewScoped
public class DynaFormController implements Serializable {

    private DynaFormModel model;

    @PostConstruct
    public void init() {
        model = new DynaFormModel();
    }
}
