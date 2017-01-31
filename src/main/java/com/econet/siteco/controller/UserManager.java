package com.econet.siteco.controller;

import com.econet.siteco.model.User;
import com.econet.siteco.service.UserService;
import org.apache.log4j.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

/**
 * Created by Aaron on 01/24/2017.
 */
@Named
@ApplicationScoped
public class UserManager implements Serializable {

    private static final Logger logger = Logger.getLogger(UserManager.class);
    @Inject
    private UserService userService;
    private User currentUser;

    public Boolean isSignedIn() {
        return currentUser != null;
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }

    public String signIn(String username, String password) {
        User user = userService.getByUsername(username);
        if (user == null || !password.equals(user.getPassword())) {
            return "sign-in";
        }

        currentUser = user;
        return "index";
    }

    public String signOut() {
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        //FacesContext.getCurrentInstance().getExternalContext().getInitParameter("parameter name");
        return "index?faces-redirect=true";
    }
}
