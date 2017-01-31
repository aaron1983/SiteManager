package com.econet.siteco.repository;

import com.econet.siteco.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Aaron on 01/24/2017.
 */
public interface UserRepository extends JpaRepository<User, String> {
    User findByUsername(String username);
}
