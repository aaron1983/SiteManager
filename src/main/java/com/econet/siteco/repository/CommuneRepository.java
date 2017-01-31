package com.econet.siteco.repository;

import com.econet.siteco.model.Commune;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Aaron on 01/20/2017.
 */
public interface CommuneRepository extends JpaRepository<Commune, Integer> {
    Commune findByName(String name);
}
