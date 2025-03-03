package com.example.gestion_memoire_app.service;

import com.example.gestion_memoire_app.entity.Etudiant;
import com.example.gestion_memoire_app.repository.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EtudiantService {

    @Autowired
    private EtudiantRepository etudiantRepository;

    public List<Etudiant> findAll() {
        return etudiantRepository.findAll();
    }

    public Optional<Etudiant> findById(Long id) {
        return etudiantRepository.findById(id);
    }

    public Etudiant save(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    public void deleteById(Long id) {
        etudiantRepository.deleteById(id);
    }
}