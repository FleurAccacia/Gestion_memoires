package com.example.gestion_memoire_app.service;

import com.example.gestion_memoire_app.entity.FicheDeStage;
import com.example.gestion_memoire_app.repository.FicheDeStageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FicheDeStageService {

    @Autowired
    private FicheDeStageRepository ficheDeStageRepository;

    public List<FicheDeStage> findAll() {
        return ficheDeStageRepository.findAll();
    }

    public Optional<FicheDeStage> findById(Long id) {
        return ficheDeStageRepository.findById(id);
    }

    public FicheDeStage save(FicheDeStage ficheDeStage) {
        return ficheDeStageRepository.save(ficheDeStage);
    }

    public void deleteById(Long id) {
        ficheDeStageRepository.deleteById(id);
    }
}