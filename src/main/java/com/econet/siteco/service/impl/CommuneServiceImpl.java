package com.econet.siteco.service.impl;

import com.econet.siteco.model.Commune;
import com.econet.siteco.repository.CommuneRepository;
import com.econet.siteco.service.CommuneService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Aaron on 01/20/2017.
 */
public class CommuneServiceImpl implements CommuneService {

    @Autowired
    private CommuneRepository repository;

    @Override
    public Commune getById(int id) {
        return repository.findOne(id);
    }

    @Override
    public Commune getByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public List<Commune> findAll() {
        return repository.findAll();
    }

    @Override
    public Commune save(Commune commune) {
        return repository.save(commune);
    }

    @Override
    public Commune update(Commune commune) {
        return repository.save(commune);
    }
}
