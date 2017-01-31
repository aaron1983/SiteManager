package com.econet.siteco.service;

import com.econet.siteco.model.User;

import java.util.List;

/**
 * Created by Aaron on 01/24/2017.
 */
public interface UserService {
    User getByUsername(String username);

    List<User> findAll();

    User save(User user);

    User update(User user);
}
