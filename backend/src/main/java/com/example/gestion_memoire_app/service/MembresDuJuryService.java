package com.example.gestion_memoire_app.service;

import com.example.gestion_memoire_app.entity.MembresDuJury;
import com.example.gestion_memoire_app.repository.MembresDuJuryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MembresDuJuryService {

    @Autowired
    private MembresDuJuryRepository membresDuJuryRepository;

    public List<MembresDuJury> findAll() {
        return membresDuJuryRepository.findAll();
    }

    public Optional<MembresDuJury> findById(Long id) {
        return membresDuJuryRepository.findById(id);
    }

    public MembresDuJury save(MembresDuJury membresDuJury) {
        return membresDuJuryRepository.save(membresDuJury);
    }

    public void deleteById(Long id) {
        membresDuJuryRepository.deleteById(id);
    }
}