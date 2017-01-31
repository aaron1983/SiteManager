package com.econet.siteco.controller;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import java.io.Serializable;

/**
 * Created by Aaron on 01/26/2017.
 */
@Named
@ApplicationScoped
public class Project implements Serializable {

    public static final String projectName = "EcoTower Application Manager";
    public static final String projectScope = "Econet Leo";
    public static final String projectOwner = "EcoTower";

    public static String getProjectName() {
        return projectName;
    }

    public static String getProjectScope() {
        return projectScope;
    }

    public static String getProjectOwner() {
        return projectOwner;
    }

    @PostConstruct
    public void init() {
        // Inject beans that outlive scopes less broader than application scope
    }
}
