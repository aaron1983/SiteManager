package com.econet.siteco.component;

import javax.faces.component.FacesComponent;
import javax.faces.component.UINamingContainer;

@FacesComponent("Tab")
/**
 * Created by Aaron on 01/20/2017.
 */
public class Tab extends UINamingContainer {

    public boolean isTabActive() {
        TabView tabView = (TabView) getCompositeComponentParent(this);

        return tabView.isTabActive(this);
    }

    public String getTabId() {
        return (String) getAttributes().get("id");
    }

    public String getTabLabel() {
        return (String) getAttributes().get("label");
    }
}