package com.example.gestion_memoire_app.service;

import com.example.gestion_memoire_app.entity.Administrateur;
import com.example.gestion_memoire_app.repository.AdministrateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdministrateurService {

    @Autowired
    private AdministrateurRepository administrateurRepository;

    public List<Administrateur> findAll() {
        return administrateurRepository.findAll();
    }

    public Optional<Administrateur> findById(Long id) {
        return administrateurRepository.findById(id);
    }

    public Administrateur save(Administrateur administrateur) {
        return administrateurRepository.save(administrateur);
    }

    public void deleteById(Long id) {
        administrateurRepository.deleteById(id);
    }
}