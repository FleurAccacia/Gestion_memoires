package com.example.gestion_memoire_app.service;

import com.example.gestion_memoire_app.entity.PresidentJury;
import com.example.gestion_memoire_app.repository.PresidentJuryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PresidentJuryService {

    @Autowired
    private PresidentJuryRepository presidentJuryRepository;

    public List<PresidentJury> findAll() {
        return presidentJuryRepository.findAll();
    }

    public Optional<PresidentJury> findById(Long id) {
        return presidentJuryRepository.findById(id);
    }

    public PresidentJury save(PresidentJury presidentJury) {
        return presidentJuryRepository.save(presidentJury);
    }

    public void deleteById(Long id) {
        presidentJuryRepository.deleteById(id);
    }
}