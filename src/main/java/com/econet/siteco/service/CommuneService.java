package com.econet.siteco.service;

import com.econet.siteco.model.Commune;

import java.util.List;

/**
 * Created by Aaron on 01/20/2017.
 */
public interface CommuneService {
    Commune getById(int id);

    Commune getByName(String name);

    List<Commune> findAll();

    Commune save(Commune commune);

    Commune update(Commune commune);

}
