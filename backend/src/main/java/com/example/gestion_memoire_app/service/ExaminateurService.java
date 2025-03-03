package com.example.gestion_memoire_app.service;

import com.example.gestion_memoire_app.entity.Examinateur;
import com.example.gestion_memoire_app.repository.ExaminateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExaminateurService {

    @Autowired
    private ExaminateurRepository examinateurRepository;

    public List<Examinateur> findAll() {
        return examinateurRepository.findAll();
    }

    public Optional<Examinateur> findById(Long id) {
        return examinateurRepository.findById(id);
    }

    public Examinateur save(Examinateur examinateur) {
        return examinateurRepository.save(examinateur);
    }

    public void deleteById(Long id) {
        examinateurRepository.deleteById(id);
    }
}